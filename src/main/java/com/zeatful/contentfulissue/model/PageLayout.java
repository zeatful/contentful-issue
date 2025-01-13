package com.zeatful.contentfulissue.model;

import com.contentful.java.cda.TransformQuery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TransformQuery.ContentfulEntryModel("pageLayout")
@Builder
public class PageLayout {
    @TransformQuery.ContentfulSystemField
    private String id;

    @TransformQuery.ContentfulField
    private String name;

    @TransformQuery.ContentfulField
    private String template;

    @TransformQuery.ContentfulField
    private String location;

    @TransformQuery.ContentfulField
    private List<PageLayoutComponent> components;
}
