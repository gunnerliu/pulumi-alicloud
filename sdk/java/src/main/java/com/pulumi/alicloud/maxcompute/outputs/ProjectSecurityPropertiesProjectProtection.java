// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.maxcompute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectSecurityPropertiesProjectProtection {
    /**
     * @return Exclusion policy.
     * 
     */
    private final @Nullable String exceptionPolicy;
    /**
     * @return Is it turned on.
     * 
     */
    private final @Nullable Boolean protected_;

    @CustomType.Constructor
    private ProjectSecurityPropertiesProjectProtection(
        @CustomType.Parameter("exceptionPolicy") @Nullable String exceptionPolicy,
        @CustomType.Parameter("protected") @Nullable Boolean protected_) {
        this.exceptionPolicy = exceptionPolicy;
        this.protected_ = protected_;
    }

    /**
     * @return Exclusion policy.
     * 
     */
    public Optional<String> exceptionPolicy() {
        return Optional.ofNullable(this.exceptionPolicy);
    }
    /**
     * @return Is it turned on.
     * 
     */
    public Optional<Boolean> protected_() {
        return Optional.ofNullable(this.protected_);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSecurityPropertiesProjectProtection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String exceptionPolicy;
        private @Nullable Boolean protected_;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSecurityPropertiesProjectProtection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exceptionPolicy = defaults.exceptionPolicy;
    	      this.protected_ = defaults.protected_;
        }

        public Builder exceptionPolicy(@Nullable String exceptionPolicy) {
            this.exceptionPolicy = exceptionPolicy;
            return this;
        }
        public Builder protected_(@Nullable Boolean protected_) {
            this.protected_ = protected_;
            return this;
        }        public ProjectSecurityPropertiesProjectProtection build() {
            return new ProjectSecurityPropertiesProjectProtection(exceptionPolicy, protected_);
        }
    }
}
