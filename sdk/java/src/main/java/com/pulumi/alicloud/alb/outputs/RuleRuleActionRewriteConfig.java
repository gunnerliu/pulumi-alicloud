// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleRuleActionRewriteConfig {
    /**
     * @return The host name of the destination to which requests are redirected within ALB.  Valid values:  The host name must be 3 to 128 characters in length, and can contain letters, digits, hyphens (-), periods (.), asterisks (*), and question marks (?). The host name must contain at least one period (.), and cannot start or end with a period (.). The rightmost domain label can contain only letters, asterisks (*) and question marks (?) and cannot contain digits or hyphens (-). Other domain labels cannot start or end with a hyphen (-). You can include asterisks (*) and question marks (?) anywhere in a domain label. Default value: ${host}. You cannot use this value with other characters at the same time.
     * 
     */
    private @Nullable String host;
    /**
     * @return The path to which requests are to be redirected within ALB.  Valid values: The path must be 1 to 128 characters in length, and start with a forward slash (/). The path can contain letters, digits, asterisks (*), question marks (?)and the following special characters: $ - _ . + / &amp; ~ @ :. It cannot contain the following special characters: &#34; % # ; ! ( ) [ ] ^ , ”. The path is case-sensitive.  Default value: ${path}. This value can be used only once. You can use it with a valid string.
     * 
     */
    private @Nullable String path;
    /**
     * @return The query string of the request to be redirected within ALB.  The query string must be 1 to 128 characters in length, can contain letters and printable characters. It cannot contain the following special characters: # [ ] { } \ | &lt; &gt; &amp;.  Default value: ${query}. This value can be used only once. You can use it with a valid string.
     * 
     */
    private @Nullable String query;

    private RuleRuleActionRewriteConfig() {}
    /**
     * @return The host name of the destination to which requests are redirected within ALB.  Valid values:  The host name must be 3 to 128 characters in length, and can contain letters, digits, hyphens (-), periods (.), asterisks (*), and question marks (?). The host name must contain at least one period (.), and cannot start or end with a period (.). The rightmost domain label can contain only letters, asterisks (*) and question marks (?) and cannot contain digits or hyphens (-). Other domain labels cannot start or end with a hyphen (-). You can include asterisks (*) and question marks (?) anywhere in a domain label. Default value: ${host}. You cannot use this value with other characters at the same time.
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * @return The path to which requests are to be redirected within ALB.  Valid values: The path must be 1 to 128 characters in length, and start with a forward slash (/). The path can contain letters, digits, asterisks (*), question marks (?)and the following special characters: $ - _ . + / &amp; ~ @ :. It cannot contain the following special characters: &#34; % # ; ! ( ) [ ] ^ , ”. The path is case-sensitive.  Default value: ${path}. This value can be used only once. You can use it with a valid string.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return The query string of the request to be redirected within ALB.  The query string must be 1 to 128 characters in length, can contain letters and printable characters. It cannot contain the following special characters: # [ ] { } \ | &lt; &gt; &amp;.  Default value: ${query}. This value can be used only once. You can use it with a valid string.
     * 
     */
    public Optional<String> query() {
        return Optional.ofNullable(this.query);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleRuleActionRewriteConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String host;
        private @Nullable String path;
        private @Nullable String query;
        public Builder() {}
        public Builder(RuleRuleActionRewriteConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.query = defaults.query;
        }

        @CustomType.Setter
        public Builder host(@Nullable String host) {
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder query(@Nullable String query) {
            this.query = query;
            return this;
        }
        public RuleRuleActionRewriteConfig build() {
            final var o = new RuleRuleActionRewriteConfig();
            o.host = host;
            o.path = path;
            o.query = query;
            return o;
        }
    }
}