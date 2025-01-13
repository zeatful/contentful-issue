package com.zeatful.contentfulissue.client;

import com.contentful.java.cda.CDAClient;
import com.contentful.java.cda.TransformQuery;
import jakarta.annotation.Nullable;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContentfulClient {
    private static final int MAX_INCLUDE = 6;

    @Value("${contentful.spaceid}")
    private String spaceId;
    @Value("${contentful.token}")
    private String token;
    @Value("${contentful.env}")
    private String environment;


    public <A> List<A> get(
            Class<A> clazz, Map<String, Optional<String>> conditions) {
        return get(clazz, conditions, null);
    }

    public <A> List<A> get(
            Class<A> clazz,
            Map<String, Optional<String>> conditions,
            @Nullable List<String> selects) {

        CDAClient cdaClient = CDAClient.builder()
                .setSpace(spaceId)
                .setToken(token)
                .setEnvironment(environment)
                .build();

        TransformQuery<A> partial = cdaClient.observeAndTransform(clazz);

        if (selects != null) {
            partial.select(selects.toArray(new String[0]));
        }
        for (Map.Entry<String, Optional<String>> entry : conditions.entrySet()) {
            if (entry.getValue().isPresent()) {
                partial = partial.where(entry.getKey(), entry.getValue().get());
            }
        }

        return partial.include(MAX_INCLUDE).all().blockingFirst().stream().toList();
    }
}
