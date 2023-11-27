// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.maxcompute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectPropertiesTableLifecycle {
    /**
     * @return Life cycle type.
     * 
     */
    private @Nullable String type;
    /**
     * @return The value of the life cycle.
     * 
     */
    private @Nullable String value;

    private ProjectPropertiesTableLifecycle() {}
    /**
     * @return Life cycle type.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return The value of the life cycle.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectPropertiesTableLifecycle defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String type;
        private @Nullable String value;
        public Builder() {}
        public Builder(ProjectPropertiesTableLifecycle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ProjectPropertiesTableLifecycle build() {
            final var _resultValue = new ProjectPropertiesTableLifecycle();
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
