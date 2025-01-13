package com.zeatful.contentfulissue.service;

import com.zeatful.contentfulissue.client.ContentfulClient;
import com.zeatful.contentfulissue.model.PageLayout;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContentfulService {
    private final ContentfulClient contentfulClient;

    public PageLayout getPageLayout(){
        List<PageLayout> layouts = contentfulClient.get(
                PageLayout.class,
                Map.of(
                        "fields.template",
                        Optional.of("TEMPLATE_NAME"),
                        "fields.location",
                        Optional.of("some_place")
                ));

        return layouts.get(0);
    }
}
