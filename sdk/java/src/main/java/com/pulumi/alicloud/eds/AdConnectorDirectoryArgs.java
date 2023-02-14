// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AdConnectorDirectoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final AdConnectorDirectoryArgs Empty = new AdConnectorDirectoryArgs();

    /**
     * The desktop access type. Valid values: `VPC`, `INTERNET`, `ANY`.
     * 
     */
    @Import(name="desktopAccessType")
    private @Nullable Output<String> desktopAccessType;

    /**
     * @return The desktop access type. Valid values: `VPC`, `INTERNET`, `ANY`.
     * 
     */
    public Optional<Output<String>> desktopAccessType() {
        return Optional.ofNullable(this.desktopAccessType);
    }

    /**
     * The name of the directory. The name must be 2 to 255 characters in length. It must start with a letter but cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     * 
     */
    @Import(name="directoryName", required=true)
    private Output<String> directoryName;

    /**
     * @return The name of the directory. The name must be 2 to 255 characters in length. It must start with a letter but cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     * 
     */
    public Output<String> directoryName() {
        return this.directoryName;
    }

    /**
     * The DNS address list.
     * 
     */
    @Import(name="dnsAddresses", required=true)
    private Output<List<String>> dnsAddresses;

    /**
     * @return The DNS address list.
     * 
     */
    public Output<List<String>> dnsAddresses() {
        return this.dnsAddresses;
    }

    /**
     * The name of the domain.
     * 
     */
    @Import(name="domainName", required=true)
    private Output<String> domainName;

    /**
     * @return The name of the domain.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     * The user password of the domain administrator. The maximum number of English characters is 64.
     * 
     */
    @Import(name="domainPassword", required=true)
    private Output<String> domainPassword;

    /**
     * @return The user password of the domain administrator. The maximum number of English characters is 64.
     * 
     */
    public Output<String> domainPassword() {
        return this.domainPassword;
    }

    /**
     * The username of the domain administrator. The maximum number of English characters is 64.
     * 
     */
    @Import(name="domainUserName", required=true)
    private Output<String> domainUserName;

    /**
     * @return The username of the domain administrator. The maximum number of English characters is 64.
     * 
     */
    public Output<String> domainUserName() {
        return this.domainUserName;
    }

    /**
     * Whether to grant local administrator rights to users who use cloud desktops.
     * 
     */
    @Import(name="enableAdminAccess")
    private @Nullable Output<Boolean> enableAdminAccess;

    /**
     * @return Whether to grant local administrator rights to users who use cloud desktops.
     * 
     */
    public Optional<Output<Boolean>> enableAdminAccess() {
        return Optional.ofNullable(this.enableAdminAccess);
    }

    /**
     * Whether MFA authentication is enabled. After all AD users in this directory log on to the cloud desktop, enter the correct password and then enter the dynamic verification code generated by the MFA device. **NOTE:** The MFA device needs to be bound when logging in for the first time.
     * 
     */
    @Import(name="mfaEnabled")
    private @Nullable Output<Boolean> mfaEnabled;

    /**
     * @return Whether MFA authentication is enabled. After all AD users in this directory log on to the cloud desktop, enter the correct password and then enter the dynamic verification code generated by the MFA device. **NOTE:** The MFA device needs to be bound when logging in for the first time.
     * 
     */
    public Optional<Output<Boolean>> mfaEnabled() {
        return Optional.ofNullable(this.mfaEnabled);
    }

    /**
     * The AD Connector specifications. Valid values: `1`, `2`.
     * 
     */
    @Import(name="specification")
    private @Nullable Output<Integer> specification;

    /**
     * @return The AD Connector specifications. Valid values: `1`, `2`.
     * 
     */
    public Optional<Output<Integer>> specification() {
        return Optional.ofNullable(this.specification);
    }

    /**
     * The Enterprise already has the DNS address of the AD subdomain. If `sub_domain_name` is set and this parameter is not set, the child Domain DNS is considered consistent with the parent domain.
     * 
     */
    @Import(name="subDomainDnsAddresses")
    private @Nullable Output<List<String>> subDomainDnsAddresses;

    /**
     * @return The Enterprise already has the DNS address of the AD subdomain. If `sub_domain_name` is set and this parameter is not set, the child Domain DNS is considered consistent with the parent domain.
     * 
     */
    public Optional<Output<List<String>>> subDomainDnsAddresses() {
        return Optional.ofNullable(this.subDomainDnsAddresses);
    }

    /**
     * The Enterprise already has a fully qualified domain name (FQDN) of an AD subdomain, with both a host name and a domain name.
     * 
     */
    @Import(name="subDomainName")
    private @Nullable Output<String> subDomainName;

    /**
     * @return The Enterprise already has a fully qualified domain name (FQDN) of an AD subdomain, with both a host name and a domain name.
     * 
     */
    public Optional<Output<String>> subDomainName() {
        return Optional.ofNullable(this.subDomainName);
    }

    /**
     * List of VSwitch IDs in the directory.
     * 
     */
    @Import(name="vswitchIds", required=true)
    private Output<List<String>> vswitchIds;

    /**
     * @return List of VSwitch IDs in the directory.
     * 
     */
    public Output<List<String>> vswitchIds() {
        return this.vswitchIds;
    }

    private AdConnectorDirectoryArgs() {}

    private AdConnectorDirectoryArgs(AdConnectorDirectoryArgs $) {
        this.desktopAccessType = $.desktopAccessType;
        this.directoryName = $.directoryName;
        this.dnsAddresses = $.dnsAddresses;
        this.domainName = $.domainName;
        this.domainPassword = $.domainPassword;
        this.domainUserName = $.domainUserName;
        this.enableAdminAccess = $.enableAdminAccess;
        this.mfaEnabled = $.mfaEnabled;
        this.specification = $.specification;
        this.subDomainDnsAddresses = $.subDomainDnsAddresses;
        this.subDomainName = $.subDomainName;
        this.vswitchIds = $.vswitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdConnectorDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdConnectorDirectoryArgs $;

        public Builder() {
            $ = new AdConnectorDirectoryArgs();
        }

        public Builder(AdConnectorDirectoryArgs defaults) {
            $ = new AdConnectorDirectoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param desktopAccessType The desktop access type. Valid values: `VPC`, `INTERNET`, `ANY`.
         * 
         * @return builder
         * 
         */
        public Builder desktopAccessType(@Nullable Output<String> desktopAccessType) {
            $.desktopAccessType = desktopAccessType;
            return this;
        }

        /**
         * @param desktopAccessType The desktop access type. Valid values: `VPC`, `INTERNET`, `ANY`.
         * 
         * @return builder
         * 
         */
        public Builder desktopAccessType(String desktopAccessType) {
            return desktopAccessType(Output.of(desktopAccessType));
        }

        /**
         * @param directoryName The name of the directory. The name must be 2 to 255 characters in length. It must start with a letter but cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder directoryName(Output<String> directoryName) {
            $.directoryName = directoryName;
            return this;
        }

        /**
         * @param directoryName The name of the directory. The name must be 2 to 255 characters in length. It must start with a letter but cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder directoryName(String directoryName) {
            return directoryName(Output.of(directoryName));
        }

        /**
         * @param dnsAddresses The DNS address list.
         * 
         * @return builder
         * 
         */
        public Builder dnsAddresses(Output<List<String>> dnsAddresses) {
            $.dnsAddresses = dnsAddresses;
            return this;
        }

        /**
         * @param dnsAddresses The DNS address list.
         * 
         * @return builder
         * 
         */
        public Builder dnsAddresses(List<String> dnsAddresses) {
            return dnsAddresses(Output.of(dnsAddresses));
        }

        /**
         * @param dnsAddresses The DNS address list.
         * 
         * @return builder
         * 
         */
        public Builder dnsAddresses(String... dnsAddresses) {
            return dnsAddresses(List.of(dnsAddresses));
        }

        /**
         * @param domainName The name of the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The name of the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param domainPassword The user password of the domain administrator. The maximum number of English characters is 64.
         * 
         * @return builder
         * 
         */
        public Builder domainPassword(Output<String> domainPassword) {
            $.domainPassword = domainPassword;
            return this;
        }

        /**
         * @param domainPassword The user password of the domain administrator. The maximum number of English characters is 64.
         * 
         * @return builder
         * 
         */
        public Builder domainPassword(String domainPassword) {
            return domainPassword(Output.of(domainPassword));
        }

        /**
         * @param domainUserName The username of the domain administrator. The maximum number of English characters is 64.
         * 
         * @return builder
         * 
         */
        public Builder domainUserName(Output<String> domainUserName) {
            $.domainUserName = domainUserName;
            return this;
        }

        /**
         * @param domainUserName The username of the domain administrator. The maximum number of English characters is 64.
         * 
         * @return builder
         * 
         */
        public Builder domainUserName(String domainUserName) {
            return domainUserName(Output.of(domainUserName));
        }

        /**
         * @param enableAdminAccess Whether to grant local administrator rights to users who use cloud desktops.
         * 
         * @return builder
         * 
         */
        public Builder enableAdminAccess(@Nullable Output<Boolean> enableAdminAccess) {
            $.enableAdminAccess = enableAdminAccess;
            return this;
        }

        /**
         * @param enableAdminAccess Whether to grant local administrator rights to users who use cloud desktops.
         * 
         * @return builder
         * 
         */
        public Builder enableAdminAccess(Boolean enableAdminAccess) {
            return enableAdminAccess(Output.of(enableAdminAccess));
        }

        /**
         * @param mfaEnabled Whether MFA authentication is enabled. After all AD users in this directory log on to the cloud desktop, enter the correct password and then enter the dynamic verification code generated by the MFA device. **NOTE:** The MFA device needs to be bound when logging in for the first time.
         * 
         * @return builder
         * 
         */
        public Builder mfaEnabled(@Nullable Output<Boolean> mfaEnabled) {
            $.mfaEnabled = mfaEnabled;
            return this;
        }

        /**
         * @param mfaEnabled Whether MFA authentication is enabled. After all AD users in this directory log on to the cloud desktop, enter the correct password and then enter the dynamic verification code generated by the MFA device. **NOTE:** The MFA device needs to be bound when logging in for the first time.
         * 
         * @return builder
         * 
         */
        public Builder mfaEnabled(Boolean mfaEnabled) {
            return mfaEnabled(Output.of(mfaEnabled));
        }

        /**
         * @param specification The AD Connector specifications. Valid values: `1`, `2`.
         * 
         * @return builder
         * 
         */
        public Builder specification(@Nullable Output<Integer> specification) {
            $.specification = specification;
            return this;
        }

        /**
         * @param specification The AD Connector specifications. Valid values: `1`, `2`.
         * 
         * @return builder
         * 
         */
        public Builder specification(Integer specification) {
            return specification(Output.of(specification));
        }

        /**
         * @param subDomainDnsAddresses The Enterprise already has the DNS address of the AD subdomain. If `sub_domain_name` is set and this parameter is not set, the child Domain DNS is considered consistent with the parent domain.
         * 
         * @return builder
         * 
         */
        public Builder subDomainDnsAddresses(@Nullable Output<List<String>> subDomainDnsAddresses) {
            $.subDomainDnsAddresses = subDomainDnsAddresses;
            return this;
        }

        /**
         * @param subDomainDnsAddresses The Enterprise already has the DNS address of the AD subdomain. If `sub_domain_name` is set and this parameter is not set, the child Domain DNS is considered consistent with the parent domain.
         * 
         * @return builder
         * 
         */
        public Builder subDomainDnsAddresses(List<String> subDomainDnsAddresses) {
            return subDomainDnsAddresses(Output.of(subDomainDnsAddresses));
        }

        /**
         * @param subDomainDnsAddresses The Enterprise already has the DNS address of the AD subdomain. If `sub_domain_name` is set and this parameter is not set, the child Domain DNS is considered consistent with the parent domain.
         * 
         * @return builder
         * 
         */
        public Builder subDomainDnsAddresses(String... subDomainDnsAddresses) {
            return subDomainDnsAddresses(List.of(subDomainDnsAddresses));
        }

        /**
         * @param subDomainName The Enterprise already has a fully qualified domain name (FQDN) of an AD subdomain, with both a host name and a domain name.
         * 
         * @return builder
         * 
         */
        public Builder subDomainName(@Nullable Output<String> subDomainName) {
            $.subDomainName = subDomainName;
            return this;
        }

        /**
         * @param subDomainName The Enterprise already has a fully qualified domain name (FQDN) of an AD subdomain, with both a host name and a domain name.
         * 
         * @return builder
         * 
         */
        public Builder subDomainName(String subDomainName) {
            return subDomainName(Output.of(subDomainName));
        }

        /**
         * @param vswitchIds List of VSwitch IDs in the directory.
         * 
         * @return builder
         * 
         */
        public Builder vswitchIds(Output<List<String>> vswitchIds) {
            $.vswitchIds = vswitchIds;
            return this;
        }

        /**
         * @param vswitchIds List of VSwitch IDs in the directory.
         * 
         * @return builder
         * 
         */
        public Builder vswitchIds(List<String> vswitchIds) {
            return vswitchIds(Output.of(vswitchIds));
        }

        /**
         * @param vswitchIds List of VSwitch IDs in the directory.
         * 
         * @return builder
         * 
         */
        public Builder vswitchIds(String... vswitchIds) {
            return vswitchIds(List.of(vswitchIds));
        }

        public AdConnectorDirectoryArgs build() {
            $.directoryName = Objects.requireNonNull($.directoryName, "expected parameter 'directoryName' to be non-null");
            $.dnsAddresses = Objects.requireNonNull($.dnsAddresses, "expected parameter 'dnsAddresses' to be non-null");
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            $.domainPassword = Objects.requireNonNull($.domainPassword, "expected parameter 'domainPassword' to be non-null");
            $.domainUserName = Objects.requireNonNull($.domainUserName, "expected parameter 'domainUserName' to be non-null");
            $.vswitchIds = Objects.requireNonNull($.vswitchIds, "expected parameter 'vswitchIds' to be non-null");
            return $;
        }
    }

}