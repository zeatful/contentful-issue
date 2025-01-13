package com.zeatful.contentfulissue.model;

import com.contentful.java.cda.TransformQuery;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@TransformQuery.ContentfulEntryModel("image")
public class Image extends PageLayoutComponent implements Serializable {
    @TransformQuery.ContentfulSystemField("id")
    String contentfulId;

    @TransformQuery.ContentfulField
    private String url;
}
