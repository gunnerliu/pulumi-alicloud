// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetListenersListenerCertificate {
    /**
     * @return The ID of the Listener.
     * 
     */
    private final String id;
    /**
     * @return The type of the certificate.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetListenersListenerCertificate(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.type = type;
    }

    /**
     * @return The ID of the Listener.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The type of the certificate.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenersListenerCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenersListenerCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetListenersListenerCertificate build() {
            return new GetListenersListenerCertificate(id, type);
        }
    }
}
