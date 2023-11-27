// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AddressBookEcsTag {
    /**
     * @return The key of ECS tag that to be matched.
     * 
     */
    private @Nullable String tagKey;
    /**
     * @return The value of ECS tag that to be matched.
     * 
     */
    private @Nullable String tagValue;

    private AddressBookEcsTag() {}
    /**
     * @return The key of ECS tag that to be matched.
     * 
     */
    public Optional<String> tagKey() {
        return Optional.ofNullable(this.tagKey);
    }
    /**
     * @return The value of ECS tag that to be matched.
     * 
     */
    public Optional<String> tagValue() {
        return Optional.ofNullable(this.tagValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressBookEcsTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String tagKey;
        private @Nullable String tagValue;
        public Builder() {}
        public Builder(AddressBookEcsTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagKey = defaults.tagKey;
    	      this.tagValue = defaults.tagValue;
        }

        @CustomType.Setter
        public Builder tagKey(@Nullable String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        @CustomType.Setter
        public Builder tagValue(@Nullable String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public AddressBookEcsTag build() {
            final var _resultValue = new AddressBookEcsTag();
            _resultValue.tagKey = tagKey;
            _resultValue.tagValue = tagValue;
            return _resultValue;
        }
    }
}
