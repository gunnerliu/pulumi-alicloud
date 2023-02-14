// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ros.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TemplateState extends com.pulumi.resources.ResourceArgs {

    public static final TemplateState Empty = new TemplateState();

    /**
     * The description of the template. The description can be up to 256 characters in length.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the template. The description can be up to 256 characters in length.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You must specify one of the TemplateBody and TemplateURL parameters, but you cannot specify both of them.
     * 
     */
    @Import(name="templateBody")
    private @Nullable Output<String> templateBody;

    /**
     * @return The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You must specify one of the TemplateBody and TemplateURL parameters, but you cannot specify both of them.
     * 
     */
    public Optional<Output<String>> templateBody() {
        return Optional.ofNullable(this.templateBody);
    }

    /**
     * The name of the template. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
     * 
     */
    @Import(name="templateName")
    private @Nullable Output<String> templateName;

    /**
     * @return The name of the template. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
     * 
     */
    public Optional<Output<String>> templateName() {
        return Optional.ofNullable(this.templateName);
    }

    /**
     * The template url.
     * 
     */
    @Import(name="templateUrl")
    private @Nullable Output<String> templateUrl;

    /**
     * @return The template url.
     * 
     */
    public Optional<Output<String>> templateUrl() {
        return Optional.ofNullable(this.templateUrl);
    }

    private TemplateState() {}

    private TemplateState(TemplateState $) {
        this.description = $.description;
        this.tags = $.tags;
        this.templateBody = $.templateBody;
        this.templateName = $.templateName;
        this.templateUrl = $.templateUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateState $;

        public Builder() {
            $ = new TemplateState();
        }

        public Builder(TemplateState defaults) {
            $ = new TemplateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the template. The description can be up to 256 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the template. The description can be up to 256 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param templateBody The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You must specify one of the TemplateBody and TemplateURL parameters, but you cannot specify both of them.
         * 
         * @return builder
         * 
         */
        public Builder templateBody(@Nullable Output<String> templateBody) {
            $.templateBody = templateBody;
            return this;
        }

        /**
         * @param templateBody The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You must specify one of the TemplateBody and TemplateURL parameters, but you cannot specify both of them.
         * 
         * @return builder
         * 
         */
        public Builder templateBody(String templateBody) {
            return templateBody(Output.of(templateBody));
        }

        /**
         * @param templateName The name of the template. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
         * 
         * @return builder
         * 
         */
        public Builder templateName(@Nullable Output<String> templateName) {
            $.templateName = templateName;
            return this;
        }

        /**
         * @param templateName The name of the template. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
         * 
         * @return builder
         * 
         */
        public Builder templateName(String templateName) {
            return templateName(Output.of(templateName));
        }

        /**
         * @param templateUrl The template url.
         * 
         * @return builder
         * 
         */
        public Builder templateUrl(@Nullable Output<String> templateUrl) {
            $.templateUrl = templateUrl;
            return this;
        }

        /**
         * @param templateUrl The template url.
         * 
         * @return builder
         * 
         */
        public Builder templateUrl(String templateUrl) {
            return templateUrl(Output.of(templateUrl));
        }

        public TemplateState build() {
            return $;
        }
    }

}