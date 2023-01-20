// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.maxcompute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectSecurityPropertiesProjectProtectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectSecurityPropertiesProjectProtectionArgs Empty = new ProjectSecurityPropertiesProjectProtectionArgs();

    /**
     * Exclusion policy.
     * 
     */
    @Import(name="exceptionPolicy")
    private @Nullable Output<String> exceptionPolicy;

    /**
     * @return Exclusion policy.
     * 
     */
    public Optional<Output<String>> exceptionPolicy() {
        return Optional.ofNullable(this.exceptionPolicy);
    }

    /**
     * Is it turned on.
     * 
     */
    @Import(name="protected")
    private @Nullable Output<Boolean> protected_;

    /**
     * @return Is it turned on.
     * 
     */
    public Optional<Output<Boolean>> protected_() {
        return Optional.ofNullable(this.protected_);
    }

    private ProjectSecurityPropertiesProjectProtectionArgs() {}

    private ProjectSecurityPropertiesProjectProtectionArgs(ProjectSecurityPropertiesProjectProtectionArgs $) {
        this.exceptionPolicy = $.exceptionPolicy;
        this.protected_ = $.protected_;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectSecurityPropertiesProjectProtectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectSecurityPropertiesProjectProtectionArgs $;

        public Builder() {
            $ = new ProjectSecurityPropertiesProjectProtectionArgs();
        }

        public Builder(ProjectSecurityPropertiesProjectProtectionArgs defaults) {
            $ = new ProjectSecurityPropertiesProjectProtectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exceptionPolicy Exclusion policy.
         * 
         * @return builder
         * 
         */
        public Builder exceptionPolicy(@Nullable Output<String> exceptionPolicy) {
            $.exceptionPolicy = exceptionPolicy;
            return this;
        }

        /**
         * @param exceptionPolicy Exclusion policy.
         * 
         * @return builder
         * 
         */
        public Builder exceptionPolicy(String exceptionPolicy) {
            return exceptionPolicy(Output.of(exceptionPolicy));
        }

        /**
         * @param protected_ Is it turned on.
         * 
         * @return builder
         * 
         */
        public Builder protected_(@Nullable Output<Boolean> protected_) {
            $.protected_ = protected_;
            return this;
        }

        /**
         * @param protected_ Is it turned on.
         * 
         * @return builder
         * 
         */
        public Builder protected_(Boolean protected_) {
            return protected_(Output.of(protected_));
        }

        public ProjectSecurityPropertiesProjectProtectionArgs build() {
            return $;
        }
    }

}
