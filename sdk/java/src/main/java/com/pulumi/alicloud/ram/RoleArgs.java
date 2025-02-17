// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleArgs Empty = new RoleArgs();

    /**
     * Description of the RAM role. This name can have a string of 1 to 1024 characters. **NOTE:** The `description` supports modification since V1.144.0.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the RAM role. This name can have a string of 1 to 1024 characters. **NOTE:** The `description` supports modification since V1.144.0.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Authorization strategy of the RAM role. It is required when the `services` and `ram_users` are not specified.
     * 
     */
    @Import(name="document")
    private @Nullable Output<String> document;

    /**
     * @return Authorization strategy of the RAM role. It is required when the `services` and `ram_users` are not specified.
     * 
     */
    public Optional<Output<String>> document() {
        return Optional.ofNullable(this.document);
    }

    /**
     * This parameter is used for resource destroy. Default value is `false`.
     * 
     */
    @Import(name="force")
    private @Nullable Output<Boolean> force;

    /**
     * @return This parameter is used for resource destroy. Default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * The maximum session duration of the RAM role. Valid values: 3600 to 43200. Unit: seconds. Default value: 3600. The default value is used if the parameter is not specified.
     * 
     */
    @Import(name="maxSessionDuration")
    private @Nullable Output<Integer> maxSessionDuration;

    /**
     * @return The maximum session duration of the RAM role. Valid values: 3600 to 43200. Unit: seconds. Default value: 3600. The default value is used if the parameter is not specified.
     * 
     */
    public Optional<Output<Integer>> maxSessionDuration() {
        return Optional.ofNullable(this.maxSessionDuration);
    }

    /**
     * Name of the RAM role. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;, &#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the RAM role. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;, &#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (It has been deprecated since version 1.49.0, and use field &#39;document&#39; to replace.) List of ram users who can assume the RAM role. The format of each item in this list is `acs:ram::${account_id}:root` or `acs:ram::${account_id}:user/${user_name}`, such as `acs:ram::1234567890000:root` and `acs:ram::1234567890001:user/Mary`. The `${user_name}` is the name of a RAM user which must exists in the Alicloud account indicated by the `${account_id}`.
     * 
     * @deprecated
     * Field &#39;ram_users&#39; has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.
     * 
     */
    @Deprecated /* Field 'ram_users' has been deprecated from version 1.49.0, and use field 'document' to replace.  */
    @Import(name="ramUsers")
    private @Nullable Output<List<String>> ramUsers;

    /**
     * @return (It has been deprecated since version 1.49.0, and use field &#39;document&#39; to replace.) List of ram users who can assume the RAM role. The format of each item in this list is `acs:ram::${account_id}:root` or `acs:ram::${account_id}:user/${user_name}`, such as `acs:ram::1234567890000:root` and `acs:ram::1234567890001:user/Mary`. The `${user_name}` is the name of a RAM user which must exists in the Alicloud account indicated by the `${account_id}`.
     * 
     * @deprecated
     * Field &#39;ram_users&#39; has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.
     * 
     */
    @Deprecated /* Field 'ram_users' has been deprecated from version 1.49.0, and use field 'document' to replace.  */
    public Optional<Output<List<String>>> ramUsers() {
        return Optional.ofNullable(this.ramUsers);
    }

    /**
     * (It has been deprecated since version 1.49.0, and use field &#39;document&#39; to replace.) List of services which can assume the RAM role. The format of each item in this list is `${service}.aliyuncs.com` or `${account_id}@${service}.aliyuncs.com`, such as `ecs.aliyuncs.com` and `1234567890000@ots.aliyuncs.com`. The `${service}` can be `ecs`, `log`, `apigateway` and so on, the `${account_id}` refers to someone&#39;s Alicloud account id.
     * 
     * @deprecated
     * Field &#39;services&#39; has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.
     * 
     */
    @Deprecated /* Field 'services' has been deprecated from version 1.49.0, and use field 'document' to replace.  */
    @Import(name="services")
    private @Nullable Output<List<String>> services;

    /**
     * @return (It has been deprecated since version 1.49.0, and use field &#39;document&#39; to replace.) List of services which can assume the RAM role. The format of each item in this list is `${service}.aliyuncs.com` or `${account_id}@${service}.aliyuncs.com`, such as `ecs.aliyuncs.com` and `1234567890000@ots.aliyuncs.com`. The `${service}` can be `ecs`, `log`, `apigateway` and so on, the `${account_id}` refers to someone&#39;s Alicloud account id.
     * 
     * @deprecated
     * Field &#39;services&#39; has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.
     * 
     */
    @Deprecated /* Field 'services' has been deprecated from version 1.49.0, and use field 'document' to replace.  */
    public Optional<Output<List<String>>> services() {
        return Optional.ofNullable(this.services);
    }

    /**
     * (It has been deprecated since version 1.49.0, and use field &#39;document&#39; to replace.) Version of the RAM role policy document. Valid value is `1`. Default value is `1`.
     * 
     * @deprecated
     * Field &#39;version&#39; has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.
     * 
     */
    @Deprecated /* Field 'version' has been deprecated from version 1.49.0, and use field 'document' to replace.  */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return (It has been deprecated since version 1.49.0, and use field &#39;document&#39; to replace.) Version of the RAM role policy document. Valid value is `1`. Default value is `1`.
     * 
     * @deprecated
     * Field &#39;version&#39; has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.
     * 
     */
    @Deprecated /* Field 'version' has been deprecated from version 1.49.0, and use field 'document' to replace.  */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private RoleArgs() {}

    private RoleArgs(RoleArgs $) {
        this.description = $.description;
        this.document = $.document;
        this.force = $.force;
        this.maxSessionDuration = $.maxSessionDuration;
        this.name = $.name;
        this.ramUsers = $.ramUsers;
        this.services = $.services;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleArgs $;

        public Builder() {
            $ = new RoleArgs();
        }

        public Builder(RoleArgs defaults) {
            $ = new RoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the RAM role. This name can have a string of 1 to 1024 characters. **NOTE:** The `description` supports modification since V1.144.0.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the RAM role. This name can have a string of 1 to 1024 characters. **NOTE:** The `description` supports modification since V1.144.0.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param document Authorization strategy of the RAM role. It is required when the `services` and `ram_users` are not specified.
         * 
         * @return builder
         * 
         */
        public Builder document(@Nullable Output<String> document) {
            $.document = document;
            return this;
        }

        /**
         * @param document Authorization strategy of the RAM role. It is required when the `services` and `ram_users` are not specified.
         * 
         * @return builder
         * 
         */
        public Builder document(String document) {
            return document(Output.of(document));
        }

        /**
         * @param force This parameter is used for resource destroy. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder force(@Nullable Output<Boolean> force) {
            $.force = force;
            return this;
        }

        /**
         * @param force This parameter is used for resource destroy. Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder force(Boolean force) {
            return force(Output.of(force));
        }

        /**
         * @param maxSessionDuration The maximum session duration of the RAM role. Valid values: 3600 to 43200. Unit: seconds. Default value: 3600. The default value is used if the parameter is not specified.
         * 
         * @return builder
         * 
         */
        public Builder maxSessionDuration(@Nullable Output<Integer> maxSessionDuration) {
            $.maxSessionDuration = maxSessionDuration;
            return this;
        }

        /**
         * @param maxSessionDuration The maximum session duration of the RAM role. Valid values: 3600 to 43200. Unit: seconds. Default value: 3600. The default value is used if the parameter is not specified.
         * 
         * @return builder
         * 
         */
        public Builder maxSessionDuration(Integer maxSessionDuration) {
            return maxSessionDuration(Output.of(maxSessionDuration));
        }

        /**
         * @param name Name of the RAM role. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;, &#34;_&#34;, and must not begin with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the RAM role. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;, &#34;_&#34;, and must not begin with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ramUsers (It has been deprecated since version 1.49.0, and use field &#39;document&#39; to replace.) List of ram users who can assume the RAM role. The format of each item in this list is `acs:ram::${account_id}:root` or `acs:ram::${account_id}:user/${user_name}`, such as `acs:ram::1234567890000:root` and `acs:ram::1234567890001:user/Mary`. The `${user_name}` is the name of a RAM user which must exists in the Alicloud account indicated by the `${account_id}`.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;ram_users&#39; has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.
         * 
         */
        @Deprecated /* Field 'ram_users' has been deprecated from version 1.49.0, and use field 'document' to replace.  */
        public Builder ramUsers(@Nullable Output<List<String>> ramUsers) {
            $.ramUsers = ramUsers;
            return this;
        }

        /**
         * @param ramUsers (It has been deprecated since version 1.49.0, and use field &#39;document&#39; to replace.) List of ram users who can assume the RAM role. The format of each item in this list is `acs:ram::${account_id}:root` or `acs:ram::${account_id}:user/${user_name}`, such as `acs:ram::1234567890000:root` and `acs:ram::1234567890001:user/Mary`. The `${user_name}` is the name of a RAM user which must exists in the Alicloud account indicated by the `${account_id}`.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;ram_users&#39; has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.
         * 
         */
        @Deprecated /* Field 'ram_users' has been deprecated from version 1.49.0, and use field 'document' to replace.  */
        public Builder ramUsers(List<String> ramUsers) {
            return ramUsers(Output.of(ramUsers));
        }

        /**
         * @param ramUsers (It has been deprecated since version 1.49.0, and use field &#39;document&#39; to replace.) List of ram users who can assume the RAM role. The format of each item in this list is `acs:ram::${account_id}:root` or `acs:ram::${account_id}:user/${user_name}`, such as `acs:ram::1234567890000:root` and `acs:ram::1234567890001:user/Mary`. The `${user_name}` is the name of a RAM user which must exists in the Alicloud account indicated by the `${account_id}`.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;ram_users&#39; has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.
         * 
         */
        @Deprecated /* Field 'ram_users' has been deprecated from version 1.49.0, and use field 'document' to replace.  */
        public Builder ramUsers(String... ramUsers) {
            return ramUsers(List.of(ramUsers));
        }

        /**
         * @param services (It has been deprecated since version 1.49.0, and use field &#39;document&#39; to replace.) List of services which can assume the RAM role. The format of each item in this list is `${service}.aliyuncs.com` or `${account_id}@${service}.aliyuncs.com`, such as `ecs.aliyuncs.com` and `1234567890000@ots.aliyuncs.com`. The `${service}` can be `ecs`, `log`, `apigateway` and so on, the `${account_id}` refers to someone&#39;s Alicloud account id.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;services&#39; has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.
         * 
         */
        @Deprecated /* Field 'services' has been deprecated from version 1.49.0, and use field 'document' to replace.  */
        public Builder services(@Nullable Output<List<String>> services) {
            $.services = services;
            return this;
        }

        /**
         * @param services (It has been deprecated since version 1.49.0, and use field &#39;document&#39; to replace.) List of services which can assume the RAM role. The format of each item in this list is `${service}.aliyuncs.com` or `${account_id}@${service}.aliyuncs.com`, such as `ecs.aliyuncs.com` and `1234567890000@ots.aliyuncs.com`. The `${service}` can be `ecs`, `log`, `apigateway` and so on, the `${account_id}` refers to someone&#39;s Alicloud account id.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;services&#39; has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.
         * 
         */
        @Deprecated /* Field 'services' has been deprecated from version 1.49.0, and use field 'document' to replace.  */
        public Builder services(List<String> services) {
            return services(Output.of(services));
        }

        /**
         * @param services (It has been deprecated since version 1.49.0, and use field &#39;document&#39; to replace.) List of services which can assume the RAM role. The format of each item in this list is `${service}.aliyuncs.com` or `${account_id}@${service}.aliyuncs.com`, such as `ecs.aliyuncs.com` and `1234567890000@ots.aliyuncs.com`. The `${service}` can be `ecs`, `log`, `apigateway` and so on, the `${account_id}` refers to someone&#39;s Alicloud account id.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;services&#39; has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.
         * 
         */
        @Deprecated /* Field 'services' has been deprecated from version 1.49.0, and use field 'document' to replace.  */
        public Builder services(String... services) {
            return services(List.of(services));
        }

        /**
         * @param version (It has been deprecated since version 1.49.0, and use field &#39;document&#39; to replace.) Version of the RAM role policy document. Valid value is `1`. Default value is `1`.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;version&#39; has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.
         * 
         */
        @Deprecated /* Field 'version' has been deprecated from version 1.49.0, and use field 'document' to replace.  */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version (It has been deprecated since version 1.49.0, and use field &#39;document&#39; to replace.) Version of the RAM role policy document. Valid value is `1`. Default value is `1`.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;version&#39; has been deprecated from version 1.49.0, and use field &#39;document&#39; to replace.
         * 
         */
        @Deprecated /* Field 'version' has been deprecated from version 1.49.0, and use field 'document' to replace.  */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public RoleArgs build() {
            return $;
        }
    }

}
