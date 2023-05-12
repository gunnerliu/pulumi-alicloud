// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleRuleActionRedirectConfig {
    /**
     * @return The host name of the destination to which requests are redirected within ALB.  Valid values:  The host name must be 3 to 128 characters in length, and can contain letters, digits, hyphens (-), periods (.), asterisks (*), and question marks (?). The host name must contain at least one period (.), and cannot start or end with a period (.). The rightmost domain label can contain only letters, asterisks (*) and question marks (?) and cannot contain digits or hyphens (-). Other domain labels cannot start or end with a hyphen (-). You can include asterisks (*) and question marks (?) anywhere in a domain label. Default value: ${host}. You cannot use this value with other characters at the same time.
     * 
     */
    private final @Nullable String host;
    /**
     * @return The redirect method. Valid values:301, 302, 303, 307, and 308.
     * 
     */
    private final @Nullable String httpCode;
    /**
     * @return The path to which requests are to be redirected within ALB.  Valid values: The path must be 1 to 128 characters in length, and start with a forward slash (/). The path can contain letters, digits, asterisks (*), question marks (?)and the following special characters: $ - _ . + / &amp; ~ @ :. It cannot contain the following special characters: &#34; % # ; ! ( ) [ ] ^ , ”. The path is case-sensitive.  Default value: ${path}. This value can be used only once. You can use it with a valid string.
     * 
     */
    private final @Nullable String path;
    /**
     * @return The port of the destination to which requests are redirected.  Valid values: 1 to 63335.  Default value: ${port}. You cannot use this value together with other characters at the same time.
     * 
     */
    private final @Nullable String port;
    /**
     * @return The protocol of the requests to be redirected.  Valid values: HTTP and HTTPS.  Default value: ${protocol}. You cannot use this value together with other characters at the same time.  Note HTTPS listeners can redirect only HTTPS requests.
     * 
     */
    private final @Nullable String protocol;
    /**
     * @return The query string of the request to be redirected within ALB.  The query string must be 1 to 128 characters in length, can contain letters and printable characters. It cannot contain the following special characters: # [ ] { } \ | &lt; &gt; &amp;.  Default value: ${query}. This value can be used only once. You can use it with a valid string.
     * 
     */
    private final @Nullable String query;

    @CustomType.Constructor
    private RuleRuleActionRedirectConfig(
        @CustomType.Parameter("host") @Nullable String host,
        @CustomType.Parameter("httpCode") @Nullable String httpCode,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("port") @Nullable String port,
        @CustomType.Parameter("protocol") @Nullable String protocol,
        @CustomType.Parameter("query") @Nullable String query) {
        this.host = host;
        this.httpCode = httpCode;
        this.path = path;
        this.port = port;
        this.protocol = protocol;
        this.query = query;
    }

    /**
     * @return The host name of the destination to which requests are redirected within ALB.  Valid values:  The host name must be 3 to 128 characters in length, and can contain letters, digits, hyphens (-), periods (.), asterisks (*), and question marks (?). The host name must contain at least one period (.), and cannot start or end with a period (.). The rightmost domain label can contain only letters, asterisks (*) and question marks (?) and cannot contain digits or hyphens (-). Other domain labels cannot start or end with a hyphen (-). You can include asterisks (*) and question marks (?) anywhere in a domain label. Default value: ${host}. You cannot use this value with other characters at the same time.
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * @return The redirect method. Valid values:301, 302, 303, 307, and 308.
     * 
     */
    public Optional<String> httpCode() {
        return Optional.ofNullable(this.httpCode);
    }
    /**
     * @return The path to which requests are to be redirected within ALB.  Valid values: The path must be 1 to 128 characters in length, and start with a forward slash (/). The path can contain letters, digits, asterisks (*), question marks (?)and the following special characters: $ - _ . + / &amp; ~ @ :. It cannot contain the following special characters: &#34; % # ; ! ( ) [ ] ^ , ”. The path is case-sensitive.  Default value: ${path}. This value can be used only once. You can use it with a valid string.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return The port of the destination to which requests are redirected.  Valid values: 1 to 63335.  Default value: ${port}. You cannot use this value together with other characters at the same time.
     * 
     */
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The protocol of the requests to be redirected.  Valid values: HTTP and HTTPS.  Default value: ${protocol}. You cannot use this value together with other characters at the same time.  Note HTTPS listeners can redirect only HTTPS requests.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
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

    public static Builder builder(RuleRuleActionRedirectConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String host;
        private @Nullable String httpCode;
        private @Nullable String path;
        private @Nullable String port;
        private @Nullable String protocol;
        private @Nullable String query;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleRuleActionRedirectConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.httpCode = defaults.httpCode;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.query = defaults.query;
        }

        public Builder host(@Nullable String host) {
            this.host = host;
            return this;
        }
        public Builder httpCode(@Nullable String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder port(@Nullable String port) {
            this.port = port;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder query(@Nullable String query) {
            this.query = query;
            return this;
        }        public RuleRuleActionRedirectConfig build() {
            return new RuleRuleActionRedirectConfig(host, httpCode, path, port, protocol, query);
        }
    }
}
