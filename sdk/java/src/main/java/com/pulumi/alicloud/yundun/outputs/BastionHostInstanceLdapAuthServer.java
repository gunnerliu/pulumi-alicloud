// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.yundun.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BastionHostInstanceLdapAuthServer {
    private final String account;
    private final String baseDn;
    private final @Nullable String emailMapping;
    private final @Nullable String filter;
    private final @Nullable Boolean isSsl;
    private final @Nullable String loginNameMapping;
    private final @Nullable String mobileMapping;
    private final @Nullable String nameMapping;
    private final String password;
    private final Integer port;
    private final String server;
    private final @Nullable String standbyServer;

    @CustomType.Constructor
    private BastionHostInstanceLdapAuthServer(
        @CustomType.Parameter("account") String account,
        @CustomType.Parameter("baseDn") String baseDn,
        @CustomType.Parameter("emailMapping") @Nullable String emailMapping,
        @CustomType.Parameter("filter") @Nullable String filter,
        @CustomType.Parameter("isSsl") @Nullable Boolean isSsl,
        @CustomType.Parameter("loginNameMapping") @Nullable String loginNameMapping,
        @CustomType.Parameter("mobileMapping") @Nullable String mobileMapping,
        @CustomType.Parameter("nameMapping") @Nullable String nameMapping,
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("server") String server,
        @CustomType.Parameter("standbyServer") @Nullable String standbyServer) {
        this.account = account;
        this.baseDn = baseDn;
        this.emailMapping = emailMapping;
        this.filter = filter;
        this.isSsl = isSsl;
        this.loginNameMapping = loginNameMapping;
        this.mobileMapping = mobileMapping;
        this.nameMapping = nameMapping;
        this.password = password;
        this.port = port;
        this.server = server;
        this.standbyServer = standbyServer;
    }

    public String account() {
        return this.account;
    }
    public String baseDn() {
        return this.baseDn;
    }
    public Optional<String> emailMapping() {
        return Optional.ofNullable(this.emailMapping);
    }
    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }
    public Optional<Boolean> isSsl() {
        return Optional.ofNullable(this.isSsl);
    }
    public Optional<String> loginNameMapping() {
        return Optional.ofNullable(this.loginNameMapping);
    }
    public Optional<String> mobileMapping() {
        return Optional.ofNullable(this.mobileMapping);
    }
    public Optional<String> nameMapping() {
        return Optional.ofNullable(this.nameMapping);
    }
    public String password() {
        return this.password;
    }
    public Integer port() {
        return this.port;
    }
    public String server() {
        return this.server;
    }
    public Optional<String> standbyServer() {
        return Optional.ofNullable(this.standbyServer);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BastionHostInstanceLdapAuthServer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String account;
        private String baseDn;
        private @Nullable String emailMapping;
        private @Nullable String filter;
        private @Nullable Boolean isSsl;
        private @Nullable String loginNameMapping;
        private @Nullable String mobileMapping;
        private @Nullable String nameMapping;
        private String password;
        private Integer port;
        private String server;
        private @Nullable String standbyServer;

        public Builder() {
    	      // Empty
        }

        public Builder(BastionHostInstanceLdapAuthServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.baseDn = defaults.baseDn;
    	      this.emailMapping = defaults.emailMapping;
    	      this.filter = defaults.filter;
    	      this.isSsl = defaults.isSsl;
    	      this.loginNameMapping = defaults.loginNameMapping;
    	      this.mobileMapping = defaults.mobileMapping;
    	      this.nameMapping = defaults.nameMapping;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.server = defaults.server;
    	      this.standbyServer = defaults.standbyServer;
        }

        public Builder account(String account) {
            this.account = Objects.requireNonNull(account);
            return this;
        }
        public Builder baseDn(String baseDn) {
            this.baseDn = Objects.requireNonNull(baseDn);
            return this;
        }
        public Builder emailMapping(@Nullable String emailMapping) {
            this.emailMapping = emailMapping;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }
        public Builder isSsl(@Nullable Boolean isSsl) {
            this.isSsl = isSsl;
            return this;
        }
        public Builder loginNameMapping(@Nullable String loginNameMapping) {
            this.loginNameMapping = loginNameMapping;
            return this;
        }
        public Builder mobileMapping(@Nullable String mobileMapping) {
            this.mobileMapping = mobileMapping;
            return this;
        }
        public Builder nameMapping(@Nullable String nameMapping) {
            this.nameMapping = nameMapping;
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder server(String server) {
            this.server = Objects.requireNonNull(server);
            return this;
        }
        public Builder standbyServer(@Nullable String standbyServer) {
            this.standbyServer = standbyServer;
            return this;
        }        public BastionHostInstanceLdapAuthServer build() {
            return new BastionHostInstanceLdapAuthServer(account, baseDn, emailMapping, filter, isSsl, loginNameMapping, mobileMapping, nameMapping, password, port, server, standbyServer);
        }
    }
}
