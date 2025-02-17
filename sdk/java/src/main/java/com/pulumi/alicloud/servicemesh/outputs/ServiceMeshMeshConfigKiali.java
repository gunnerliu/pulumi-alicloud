// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceMeshMeshConfigKiali {
    /**
     * @return Enable CNI.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Grid topology service address.
     * 
     */
    private @Nullable String url;

    private ServiceMeshMeshConfigKiali() {}
    /**
     * @return Enable CNI.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Grid topology service address.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceMeshMeshConfigKiali defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String url;
        public Builder() {}
        public Builder(ServiceMeshMeshConfigKiali defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        public ServiceMeshMeshConfigKiali build() {
            final var _resultValue = new ServiceMeshMeshConfigKiali();
            _resultValue.enabled = enabled;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
