// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.databasefilesystem.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstancesInstanceEcsList {
    /**
     * @return The ID of the ECS instance.
     * 
     */
    private String ecsId;

    private GetInstancesInstanceEcsList() {}
    /**
     * @return The ID of the ECS instance.
     * 
     */
    public String ecsId() {
        return this.ecsId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstanceEcsList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ecsId;
        public Builder() {}
        public Builder(GetInstancesInstanceEcsList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ecsId = defaults.ecsId;
        }

        @CustomType.Setter
        public Builder ecsId(String ecsId) {
            this.ecsId = Objects.requireNonNull(ecsId);
            return this;
        }
        public GetInstancesInstanceEcsList build() {
            final var _resultValue = new GetInstancesInstanceEcsList();
            _resultValue.ecsId = ecsId;
            return _resultValue;
        }
    }
}
