// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerGroupsGroupStickySessionConfig {
    /**
     * @return the cookie that is configured on the server. **NOTE:** This parameter exists if the `StickySession` parameter is set to `On` and the `StickySessionType` parameter is set to `server`.
     * 
     */
    private final String cookie;
    /**
     * @return The timeout period of a cookie. The timeout period of a cookie. Unit: seconds. Valid values: `1` to `86400`. Default value: `1000`.
     * 
     */
    private final Integer cookieTimeout;
    /**
     * @return Indicates whether sticky session is enabled. Values: `true` and `false`. Default value: `false`.  **NOTE:** This parameter exists if the `StickySession` parameter is set to `On`.
     * 
     */
    private final Boolean stickySessionEnabled;
    /**
     * @return The method that is used to handle a cookie. Values: `Server` and `Insert`.
     * 
     */
    private final String stickySessionType;

    @CustomType.Constructor
    private GetServerGroupsGroupStickySessionConfig(
        @CustomType.Parameter("cookie") String cookie,
        @CustomType.Parameter("cookieTimeout") Integer cookieTimeout,
        @CustomType.Parameter("stickySessionEnabled") Boolean stickySessionEnabled,
        @CustomType.Parameter("stickySessionType") String stickySessionType) {
        this.cookie = cookie;
        this.cookieTimeout = cookieTimeout;
        this.stickySessionEnabled = stickySessionEnabled;
        this.stickySessionType = stickySessionType;
    }

    /**
     * @return the cookie that is configured on the server. **NOTE:** This parameter exists if the `StickySession` parameter is set to `On` and the `StickySessionType` parameter is set to `server`.
     * 
     */
    public String cookie() {
        return this.cookie;
    }
    /**
     * @return The timeout period of a cookie. The timeout period of a cookie. Unit: seconds. Valid values: `1` to `86400`. Default value: `1000`.
     * 
     */
    public Integer cookieTimeout() {
        return this.cookieTimeout;
    }
    /**
     * @return Indicates whether sticky session is enabled. Values: `true` and `false`. Default value: `false`.  **NOTE:** This parameter exists if the `StickySession` parameter is set to `On`.
     * 
     */
    public Boolean stickySessionEnabled() {
        return this.stickySessionEnabled;
    }
    /**
     * @return The method that is used to handle a cookie. Values: `Server` and `Insert`.
     * 
     */
    public String stickySessionType() {
        return this.stickySessionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerGroupsGroupStickySessionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cookie;
        private Integer cookieTimeout;
        private Boolean stickySessionEnabled;
        private String stickySessionType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerGroupsGroupStickySessionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookie = defaults.cookie;
    	      this.cookieTimeout = defaults.cookieTimeout;
    	      this.stickySessionEnabled = defaults.stickySessionEnabled;
    	      this.stickySessionType = defaults.stickySessionType;
        }

        public Builder cookie(String cookie) {
            this.cookie = Objects.requireNonNull(cookie);
            return this;
        }
        public Builder cookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = Objects.requireNonNull(cookieTimeout);
            return this;
        }
        public Builder stickySessionEnabled(Boolean stickySessionEnabled) {
            this.stickySessionEnabled = Objects.requireNonNull(stickySessionEnabled);
            return this;
        }
        public Builder stickySessionType(String stickySessionType) {
            this.stickySessionType = Objects.requireNonNull(stickySessionType);
            return this;
        }        public GetServerGroupsGroupStickySessionConfig build() {
            return new GetServerGroupsGroupStickySessionConfig(cookie, cookieTimeout, stickySessionEnabled, stickySessionType);
        }
    }
}
