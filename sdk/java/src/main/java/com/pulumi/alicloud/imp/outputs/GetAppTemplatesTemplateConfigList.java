// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.imp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAppTemplatesTemplateConfigList {
    /**
     * @return Config key.
     * 
     */
    private String key;
    /**
     * @return Config Value.
     * 
     */
    private String value;

    private GetAppTemplatesTemplateConfigList() {}
    /**
     * @return Config key.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Config Value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppTemplatesTemplateConfigList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String value;
        public Builder() {}
        public Builder(GetAppTemplatesTemplateConfigList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetAppTemplatesTemplateConfigList build() {
            final var o = new GetAppTemplatesTemplateConfigList();
            o.key = key;
            o.value = value;
            return o;
        }
    }
}