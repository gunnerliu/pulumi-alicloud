// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKeyPairsPair {
    /**
     * @return The ID of the Key Pair. Its value is same as Queue Name.
     * 
     */
    private String id;
    /**
     * @return The Private Key of the Fingerprint.
     * 
     */
    private String keyPairFingerPrint;
    /**
     * @return The Key Name.
     * 
     */
    private String keyPairName;

    private GetKeyPairsPair() {}
    /**
     * @return The ID of the Key Pair. Its value is same as Queue Name.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Private Key of the Fingerprint.
     * 
     */
    public String keyPairFingerPrint() {
        return this.keyPairFingerPrint;
    }
    /**
     * @return The Key Name.
     * 
     */
    public String keyPairName() {
        return this.keyPairName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyPairsPair defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String keyPairFingerPrint;
        private String keyPairName;
        public Builder() {}
        public Builder(GetKeyPairsPair defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.keyPairFingerPrint = defaults.keyPairFingerPrint;
    	      this.keyPairName = defaults.keyPairName;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder keyPairFingerPrint(String keyPairFingerPrint) {
            this.keyPairFingerPrint = Objects.requireNonNull(keyPairFingerPrint);
            return this;
        }
        @CustomType.Setter
        public Builder keyPairName(String keyPairName) {
            this.keyPairName = Objects.requireNonNull(keyPairName);
            return this;
        }
        public GetKeyPairsPair build() {
            final var o = new GetKeyPairsPair();
            o.id = id;
            o.keyPairFingerPrint = keyPairFingerPrint;
            o.keyPairName = keyPairName;
            return o;
        }
    }
}
