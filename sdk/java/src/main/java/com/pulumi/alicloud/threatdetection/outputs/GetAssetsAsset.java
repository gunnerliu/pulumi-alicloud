// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAssetsAsset {
    /**
     * @return The creation time of the resource
     * 
     */
    private final String createTime;
    /**
     * @return The ID of the instance.
     * 
     */
    private final String id;
    /**
     * @return The UUID of the instance.
     * 
     */
    private final String uuid;

    @CustomType.Constructor
    private GetAssetsAsset(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("uuid") String uuid) {
        this.createTime = createTime;
        this.id = id;
        this.uuid = uuid;
    }

    /**
     * @return The creation time of the resource
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The ID of the instance.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The UUID of the instance.
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssetsAsset defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String id;
        private String uuid;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssetsAsset defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.id = defaults.id;
    	      this.uuid = defaults.uuid;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder uuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }        public GetAssetsAsset build() {
            return new GetAssetsAsset(createTime, id, uuid);
        }
    }
}
