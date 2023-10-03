// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleRuleConditionHeaderConfig {
    /**
     * @return The name of the inserted header field. The name must be 1 to 40 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). You cannot use the same name in InsertHeader. Note You cannot use Cookie or Host in the name.
     * 
     */
    private @Nullable String key;
    /**
     * @return Add one or more IP addresses or IP address segments. You can add up to 5 forwarding rules in a SourceIp.
     * 
     */
    private @Nullable List<String> values;

    private RuleRuleConditionHeaderConfig() {}
    /**
     * @return The name of the inserted header field. The name must be 1 to 40 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). You cannot use the same name in InsertHeader. Note You cannot use Cookie or Host in the name.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return Add one or more IP addresses or IP address segments. You can add up to 5 forwarding rules in a SourceIp.
     * 
     */
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleRuleConditionHeaderConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String key;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(RuleRuleConditionHeaderConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public RuleRuleConditionHeaderConfig build() {
            final var o = new RuleRuleConditionHeaderConfig();
            o.key = key;
            o.values = values;
            return o;
        }
    }
}
