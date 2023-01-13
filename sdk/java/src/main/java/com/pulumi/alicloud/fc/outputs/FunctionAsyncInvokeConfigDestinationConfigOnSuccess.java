// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FunctionAsyncInvokeConfigDestinationConfigOnSuccess {
    /**
     * @return Alicloud Resource Name (ARN) of the destination resource. See the [Developer Guide](https://www.alibabacloud.com/help/doc-detail/181866.htm) for acceptable resource types and associated RAM permissions.
     * 
     */
    private String destination;

    private FunctionAsyncInvokeConfigDestinationConfigOnSuccess() {}
    /**
     * @return Alicloud Resource Name (ARN) of the destination resource. See the [Developer Guide](https://www.alibabacloud.com/help/doc-detail/181866.htm) for acceptable resource types and associated RAM permissions.
     * 
     */
    public String destination() {
        return this.destination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionAsyncInvokeConfigDestinationConfigOnSuccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String destination;
        public Builder() {}
        public Builder(FunctionAsyncInvokeConfigDestinationConfigOnSuccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        @CustomType.Setter
        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public FunctionAsyncInvokeConfigDestinationConfigOnSuccess build() {
            final var o = new FunctionAsyncInvokeConfigDestinationConfigOnSuccess();
            o.destination = destination;
            return o;
        }
    }
}
