package com.zeatful.contentfulissue.model;

import com.contentful.java.cda.TransformQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@TransformQuery.ContentfulEntryModel(value = "componentSpacing")
public class ComponentSpacing implements Serializable {
    @TransformQuery.ContentfulField
    private String name;

    @TransformQuery.ContentfulField
    private String baseComponentName;

    @TransformQuery.ContentfulField
    private String topSpacingDesktop;

    @TransformQuery.ContentfulField
    private String topSpacingMobile;

    @TransformQuery.ContentfulField
    private String bottomSpacingDesktop;

    @TransformQuery.ContentfulField
    private String bottomSpacingMobile;
}

