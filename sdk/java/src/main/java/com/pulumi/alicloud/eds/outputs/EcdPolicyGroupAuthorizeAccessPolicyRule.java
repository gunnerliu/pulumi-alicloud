// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EcdPolicyGroupAuthorizeAccessPolicyRule {
    /**
     * @return The cidrip of security rules.
     * 
     */
    private @Nullable String cidrIp;
    /**
     * @return The description of security rules.
     * 
     */
    private @Nullable String description;

    private EcdPolicyGroupAuthorizeAccessPolicyRule() {}
    /**
     * @return The cidrip of security rules.
     * 
     */
    public Optional<String> cidrIp() {
        return Optional.ofNullable(this.cidrIp);
    }
    /**
     * @return The description of security rules.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EcdPolicyGroupAuthorizeAccessPolicyRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cidrIp;
        private @Nullable String description;
        public Builder() {}
        public Builder(EcdPolicyGroupAuthorizeAccessPolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrIp = defaults.cidrIp;
    	      this.description = defaults.description;
        }

        @CustomType.Setter
        public Builder cidrIp(@Nullable String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public EcdPolicyGroupAuthorizeAccessPolicyRule build() {
            final var o = new EcdPolicyGroupAuthorizeAccessPolicyRule();
            o.cidrIp = cidrIp;
            o.description = description;
            return o;
        }
    }
}