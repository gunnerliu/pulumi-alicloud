// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstancePgHbaConf {
    /**
     * @return The IP addresses from which the specified users can access the specified databases. If you set this parameter to 0.0.0.0/0, the specified users are allowed to access the specified databases from all IP addresses.
     * 
     */
    private String address;
    /**
     * @return The name of the database that the specified users are allowed to access. If you set this parameter to all, the specified users are allowed to access all databases in the instance. If you specify multiple databases, separate the database names with commas (,).
     * 
     */
    private String database;
    /**
     * @return The mask of the instance. If the value of the `Address` parameter is an IP address, you can use this parameter to specify the mask of the IP address.
     * 
     */
    private @Nullable String mask;
    /**
     * @return The authentication method of Lightweight Directory Access Protocol (LDAP). Valid values: `trust`, `reject`, `scram-sha-256`, `md5`, `password`, `gss`, `sspi`, `ldap`, `radius`, `cert`, `pam`.
     * 
     */
    private String method;
    /**
     * @return Optional. The value of this parameter is based on the value of the HbaItem.N.Method parameter. In this topic, LDAP is used as an example. You must configure this parameter. For more information, see [Authentication Methods](https://www.postgresql.org/docs/11/auth-methods.html).
     * 
     */
    private @Nullable String option;
    /**
     * @return The priority of an AD domain. If you set this parameter to 0, the AD domain has the highest priority. Valid values: 0 to 10000. This parameter is used to identify each AD domain. When you add an AD domain, the value of the PriorityId parameter of the new AD domain cannot be the same as the value of the PriorityId parameter for any existing AD domain. When you modify or delete an AD domain, you must also modify or delete the value of the PriorityId parameter for this AD domain.
     * 
     */
    private Integer priorityId;
    /**
     * @return The type of connection to the instance. Valid values:
     * * **host**: specifies to verify TCP/IP connections, including SSL connections and non-SSL connections.
     * * **hostssl**: specifies to verify only TCP/IP connections that are established over SSL connections.
     * * **hostnossl**: specifies to verify only TCP/IP connections that are established over non-SSL connections.
     * 
     */
    private String type;
    /**
     * @return The user that is allowed to access the instance. If you specify multiple users, separate the usernames with commas (,).
     * 
     */
    private String user;

    private InstancePgHbaConf() {}
    /**
     * @return The IP addresses from which the specified users can access the specified databases. If you set this parameter to 0.0.0.0/0, the specified users are allowed to access the specified databases from all IP addresses.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return The name of the database that the specified users are allowed to access. If you set this parameter to all, the specified users are allowed to access all databases in the instance. If you specify multiple databases, separate the database names with commas (,).
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return The mask of the instance. If the value of the `Address` parameter is an IP address, you can use this parameter to specify the mask of the IP address.
     * 
     */
    public Optional<String> mask() {
        return Optional.ofNullable(this.mask);
    }
    /**
     * @return The authentication method of Lightweight Directory Access Protocol (LDAP). Valid values: `trust`, `reject`, `scram-sha-256`, `md5`, `password`, `gss`, `sspi`, `ldap`, `radius`, `cert`, `pam`.
     * 
     */
    public String method() {
        return this.method;
    }
    /**
     * @return Optional. The value of this parameter is based on the value of the HbaItem.N.Method parameter. In this topic, LDAP is used as an example. You must configure this parameter. For more information, see [Authentication Methods](https://www.postgresql.org/docs/11/auth-methods.html).
     * 
     */
    public Optional<String> option() {
        return Optional.ofNullable(this.option);
    }
    /**
     * @return The priority of an AD domain. If you set this parameter to 0, the AD domain has the highest priority. Valid values: 0 to 10000. This parameter is used to identify each AD domain. When you add an AD domain, the value of the PriorityId parameter of the new AD domain cannot be the same as the value of the PriorityId parameter for any existing AD domain. When you modify or delete an AD domain, you must also modify or delete the value of the PriorityId parameter for this AD domain.
     * 
     */
    public Integer priorityId() {
        return this.priorityId;
    }
    /**
     * @return The type of connection to the instance. Valid values:
     * * **host**: specifies to verify TCP/IP connections, including SSL connections and non-SSL connections.
     * * **hostssl**: specifies to verify only TCP/IP connections that are established over SSL connections.
     * * **hostnossl**: specifies to verify only TCP/IP connections that are established over non-SSL connections.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The user that is allowed to access the instance. If you specify multiple users, separate the usernames with commas (,).
     * 
     */
    public String user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePgHbaConf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String database;
        private @Nullable String mask;
        private String method;
        private @Nullable String option;
        private Integer priorityId;
        private String type;
        private String user;
        public Builder() {}
        public Builder(InstancePgHbaConf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.database = defaults.database;
    	      this.mask = defaults.mask;
    	      this.method = defaults.method;
    	      this.option = defaults.option;
    	      this.priorityId = defaults.priorityId;
    	      this.type = defaults.type;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        @CustomType.Setter
        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        @CustomType.Setter
        public Builder mask(@Nullable String mask) {
            this.mask = mask;
            return this;
        }
        @CustomType.Setter
        public Builder method(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }
        @CustomType.Setter
        public Builder option(@Nullable String option) {
            this.option = option;
            return this;
        }
        @CustomType.Setter
        public Builder priorityId(Integer priorityId) {
            this.priorityId = Objects.requireNonNull(priorityId);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder user(String user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }
        public InstancePgHbaConf build() {
            final var o = new InstancePgHbaConf();
            o.address = address;
            o.database = database;
            o.mask = mask;
            o.method = method;
            o.option = option;
            o.priorityId = priorityId;
            o.type = type;
            o.user = user;
            return o;
        }
    }
}
