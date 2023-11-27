// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DynamicTagGroupMatchExpress {
    /**
     * @return The tag value. The Tag value must be used in conjunction with the tag value matching method TagValueMatchFunction.
     * 
     */
    private String tagValue;
    /**
     * @return Matching method of tag value. Valid values: `all`, `startWith`,`endWith`,`contains`,`notContains`,`equals`.
     * 
     */
    private String tagValueMatchFunction;

    private DynamicTagGroupMatchExpress() {}
    /**
     * @return The tag value. The Tag value must be used in conjunction with the tag value matching method TagValueMatchFunction.
     * 
     */
    public String tagValue() {
        return this.tagValue;
    }
    /**
     * @return Matching method of tag value. Valid values: `all`, `startWith`,`endWith`,`contains`,`notContains`,`equals`.
     * 
     */
    public String tagValueMatchFunction() {
        return this.tagValueMatchFunction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicTagGroupMatchExpress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String tagValue;
        private String tagValueMatchFunction;
        public Builder() {}
        public Builder(DynamicTagGroupMatchExpress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagValue = defaults.tagValue;
    	      this.tagValueMatchFunction = defaults.tagValueMatchFunction;
        }

        @CustomType.Setter
        public Builder tagValue(String tagValue) {
            this.tagValue = Objects.requireNonNull(tagValue);
            return this;
        }
        @CustomType.Setter
        public Builder tagValueMatchFunction(String tagValueMatchFunction) {
            this.tagValueMatchFunction = Objects.requireNonNull(tagValueMatchFunction);
            return this;
        }
        public DynamicTagGroupMatchExpress build() {
            final var _resultValue = new DynamicTagGroupMatchExpress();
            _resultValue.tagValue = tagValue;
            _resultValue.tagValueMatchFunction = tagValueMatchFunction;
            return _resultValue;
        }
    }
}
