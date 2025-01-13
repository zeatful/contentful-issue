package com.zeatful.contentfulissue.model;

import com.contentful.java.cda.TransformQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@TransformQuery.ContentfulEntryModel(value = "components", additionalModelHints = {
        Image.class,
        ComponentSpacing.class,
        ComponentConfiguration.class
})
public class PageLayoutComponent {
    @TransformQuery.ContentfulField
    private String name;

    @TransformQuery.ContentfulField
    private ComponentConfiguration componentConfiguration;
}
