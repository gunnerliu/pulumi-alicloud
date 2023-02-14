// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVersionsVersion {
    /**
     * @return The edition of the ASM instance.
     * 
     */
    private String edition;
    /**
     * @return The ASM version id. It formats as `&lt;edition&gt;:&lt;version&gt;`.
     * 
     */
    private String id;
    /**
     * @return The AMS version.
     * 
     */
    private String version;

    private GetVersionsVersion() {}
    /**
     * @return The edition of the ASM instance.
     * 
     */
    public String edition() {
        return this.edition;
    }
    /**
     * @return The ASM version id. It formats as `&lt;edition&gt;:&lt;version&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The AMS version.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVersionsVersion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String edition;
        private String id;
        private String version;
        public Builder() {}
        public Builder(GetVersionsVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.edition = defaults.edition;
    	      this.id = defaults.id;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder edition(String edition) {
            this.edition = Objects.requireNonNull(edition);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetVersionsVersion build() {
            final var o = new GetVersionsVersion();
            o.edition = edition;
            o.id = id;
            o.version = version;
            return o;
        }
    }
}