package com.zeatful.contentfulissue.model;

import com.contentful.java.cda.TransformQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@TransformQuery.ContentfulEntryModel("componentConfiguration")
public class ComponentConfiguration implements Serializable {
    @TransformQuery.ContentfulField
    private String name;

    @TransformQuery.ContentfulField
    private String deviceType;

    @TransformQuery.ContentfulField
    private ComponentSpacing componentSpacing;
}
