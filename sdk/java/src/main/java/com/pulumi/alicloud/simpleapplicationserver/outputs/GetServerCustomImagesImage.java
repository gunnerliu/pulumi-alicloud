// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.simpleapplicationserver.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerCustomImagesImage {
    /**
     * @return The first ID of the resource.
     * 
     */
    private final String customImageId;
    /**
     * @return The name of the resource.
     * 
     */
    private final String customImageName;
    /**
     * @return Image description information.
     * 
     */
    private final String description;
    /**
     * @return The ID of the Custom Image.
     * 
     */
    private final String id;
    /**
     * @return The type of operating system used by the Mirror. Valid values: `Linux`, `Windows`.
     * 
     */
    private final String platform;

    @CustomType.Constructor
    private GetServerCustomImagesImage(
        @CustomType.Parameter("customImageId") String customImageId,
        @CustomType.Parameter("customImageName") String customImageName,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("platform") String platform) {
        this.customImageId = customImageId;
        this.customImageName = customImageName;
        this.description = description;
        this.id = id;
        this.platform = platform;
    }

    /**
     * @return The first ID of the resource.
     * 
     */
    public String customImageId() {
        return this.customImageId;
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String customImageName() {
        return this.customImageName;
    }
    /**
     * @return Image description information.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Custom Image.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The type of operating system used by the Mirror. Valid values: `Linux`, `Windows`.
     * 
     */
    public String platform() {
        return this.platform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerCustomImagesImage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customImageId;
        private String customImageName;
        private String description;
        private String id;
        private String platform;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerCustomImagesImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customImageId = defaults.customImageId;
    	      this.customImageName = defaults.customImageName;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.platform = defaults.platform;
        }

        public Builder customImageId(String customImageId) {
            this.customImageId = Objects.requireNonNull(customImageId);
            return this;
        }
        public Builder customImageName(String customImageName) {
            this.customImageName = Objects.requireNonNull(customImageName);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder platform(String platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }        public GetServerCustomImagesImage build() {
            return new GetServerCustomImagesImage(customImageId, customImageName, description, id, platform);
        }
    }
}
