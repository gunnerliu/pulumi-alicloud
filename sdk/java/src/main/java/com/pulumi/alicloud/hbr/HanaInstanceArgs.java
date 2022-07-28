// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HanaInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final HanaInstanceArgs Empty = new HanaInstanceArgs();

    /**
     * The alert settings. Valid value: `INHERITED`, which indicates that the backup client sends alert notifications in the same way as the backup vault.
     * 
     */
    @Import(name="alertSetting")
    private @Nullable Output<String> alertSetting;

    /**
     * @return The alert settings. Valid value: `INHERITED`, which indicates that the backup client sends alert notifications in the same way as the backup vault.
     * 
     */
    public Optional<Output<String>> alertSetting() {
        return Optional.ofNullable(this.alertSetting);
    }

    /**
     * The IDs of ECS instances that host the SAP HANA instance to be registered. HBR installs backup clients on the specified ECS instances.
     * 
     */
    @Import(name="ecsInstanceIds")
    private @Nullable Output<List<String>> ecsInstanceIds;

    /**
     * @return The IDs of ECS instances that host the SAP HANA instance to be registered. HBR installs backup clients on the specified ECS instances.
     * 
     */
    public Optional<Output<List<String>>> ecsInstanceIds() {
        return Optional.ofNullable(this.ecsInstanceIds);
    }

    /**
     * The name of the SAP HANA instance.
     * 
     */
    @Import(name="hanaName")
    private @Nullable Output<String> hanaName;

    /**
     * @return The name of the SAP HANA instance.
     * 
     */
    public Optional<Output<String>> hanaName() {
        return Optional.ofNullable(this.hanaName);
    }

    /**
     * The private or internal IP address of the host where the primary node of the SAP HANA instance resides.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return The private or internal IP address of the host where the primary node of the SAP HANA instance resides.
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * The instance number of the SAP HANA system.
     * 
     */
    @Import(name="instanceNumber")
    private @Nullable Output<Integer> instanceNumber;

    /**
     * @return The instance number of the SAP HANA system.
     * 
     */
    public Optional<Output<Integer>> instanceNumber() {
        return Optional.ofNullable(this.instanceNumber);
    }

    /**
     * The password that is used to connect with the SAP HANA database.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password that is used to connect with the SAP HANA database.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The security identifier (SID) of the SAP HANA database.
     * 
     */
    @Import(name="sid")
    private @Nullable Output<String> sid;

    /**
     * @return The security identifier (SID) of the SAP HANA database.
     * 
     */
    public Optional<Output<String>> sid() {
        return Optional.ofNullable(this.sid);
    }

    /**
     * Specifies whether to connect with the SAP HANA database over Secure Sockets Layer (SSL).
     * 
     */
    @Import(name="useSsl")
    private @Nullable Output<Boolean> useSsl;

    /**
     * @return Specifies whether to connect with the SAP HANA database over Secure Sockets Layer (SSL).
     * 
     */
    public Optional<Output<Boolean>> useSsl() {
        return Optional.ofNullable(this.useSsl);
    }

    /**
     * The username of the SYSTEMDB database.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return The username of the SYSTEMDB database.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    /**
     * Specifies whether to verify the SSL certificate of the SAP HANA database.
     * 
     */
    @Import(name="validateCertificate")
    private @Nullable Output<Boolean> validateCertificate;

    /**
     * @return Specifies whether to verify the SSL certificate of the SAP HANA database.
     * 
     */
    public Optional<Output<Boolean>> validateCertificate() {
        return Optional.ofNullable(this.validateCertificate);
    }

    /**
     * The ID of the backup vault.
     * 
     */
    @Import(name="vaultId", required=true)
    private Output<String> vaultId;

    /**
     * @return The ID of the backup vault.
     * 
     */
    public Output<String> vaultId() {
        return this.vaultId;
    }

    private HanaInstanceArgs() {}

    private HanaInstanceArgs(HanaInstanceArgs $) {
        this.alertSetting = $.alertSetting;
        this.ecsInstanceIds = $.ecsInstanceIds;
        this.hanaName = $.hanaName;
        this.host = $.host;
        this.instanceNumber = $.instanceNumber;
        this.password = $.password;
        this.resourceGroupId = $.resourceGroupId;
        this.sid = $.sid;
        this.useSsl = $.useSsl;
        this.userName = $.userName;
        this.validateCertificate = $.validateCertificate;
        this.vaultId = $.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HanaInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HanaInstanceArgs $;

        public Builder() {
            $ = new HanaInstanceArgs();
        }

        public Builder(HanaInstanceArgs defaults) {
            $ = new HanaInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertSetting The alert settings. Valid value: `INHERITED`, which indicates that the backup client sends alert notifications in the same way as the backup vault.
         * 
         * @return builder
         * 
         */
        public Builder alertSetting(@Nullable Output<String> alertSetting) {
            $.alertSetting = alertSetting;
            return this;
        }

        /**
         * @param alertSetting The alert settings. Valid value: `INHERITED`, which indicates that the backup client sends alert notifications in the same way as the backup vault.
         * 
         * @return builder
         * 
         */
        public Builder alertSetting(String alertSetting) {
            return alertSetting(Output.of(alertSetting));
        }

        /**
         * @param ecsInstanceIds The IDs of ECS instances that host the SAP HANA instance to be registered. HBR installs backup clients on the specified ECS instances.
         * 
         * @return builder
         * 
         */
        public Builder ecsInstanceIds(@Nullable Output<List<String>> ecsInstanceIds) {
            $.ecsInstanceIds = ecsInstanceIds;
            return this;
        }

        /**
         * @param ecsInstanceIds The IDs of ECS instances that host the SAP HANA instance to be registered. HBR installs backup clients on the specified ECS instances.
         * 
         * @return builder
         * 
         */
        public Builder ecsInstanceIds(List<String> ecsInstanceIds) {
            return ecsInstanceIds(Output.of(ecsInstanceIds));
        }

        /**
         * @param ecsInstanceIds The IDs of ECS instances that host the SAP HANA instance to be registered. HBR installs backup clients on the specified ECS instances.
         * 
         * @return builder
         * 
         */
        public Builder ecsInstanceIds(String... ecsInstanceIds) {
            return ecsInstanceIds(List.of(ecsInstanceIds));
        }

        /**
         * @param hanaName The name of the SAP HANA instance.
         * 
         * @return builder
         * 
         */
        public Builder hanaName(@Nullable Output<String> hanaName) {
            $.hanaName = hanaName;
            return this;
        }

        /**
         * @param hanaName The name of the SAP HANA instance.
         * 
         * @return builder
         * 
         */
        public Builder hanaName(String hanaName) {
            return hanaName(Output.of(hanaName));
        }

        /**
         * @param host The private or internal IP address of the host where the primary node of the SAP HANA instance resides.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The private or internal IP address of the host where the primary node of the SAP HANA instance resides.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param instanceNumber The instance number of the SAP HANA system.
         * 
         * @return builder
         * 
         */
        public Builder instanceNumber(@Nullable Output<Integer> instanceNumber) {
            $.instanceNumber = instanceNumber;
            return this;
        }

        /**
         * @param instanceNumber The instance number of the SAP HANA system.
         * 
         * @return builder
         * 
         */
        public Builder instanceNumber(Integer instanceNumber) {
            return instanceNumber(Output.of(instanceNumber));
        }

        /**
         * @param password The password that is used to connect with the SAP HANA database.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password that is used to connect with the SAP HANA database.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param sid The security identifier (SID) of the SAP HANA database.
         * 
         * @return builder
         * 
         */
        public Builder sid(@Nullable Output<String> sid) {
            $.sid = sid;
            return this;
        }

        /**
         * @param sid The security identifier (SID) of the SAP HANA database.
         * 
         * @return builder
         * 
         */
        public Builder sid(String sid) {
            return sid(Output.of(sid));
        }

        /**
         * @param useSsl Specifies whether to connect with the SAP HANA database over Secure Sockets Layer (SSL).
         * 
         * @return builder
         * 
         */
        public Builder useSsl(@Nullable Output<Boolean> useSsl) {
            $.useSsl = useSsl;
            return this;
        }

        /**
         * @param useSsl Specifies whether to connect with the SAP HANA database over Secure Sockets Layer (SSL).
         * 
         * @return builder
         * 
         */
        public Builder useSsl(Boolean useSsl) {
            return useSsl(Output.of(useSsl));
        }

        /**
         * @param userName The username of the SYSTEMDB database.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The username of the SYSTEMDB database.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        /**
         * @param validateCertificate Specifies whether to verify the SSL certificate of the SAP HANA database.
         * 
         * @return builder
         * 
         */
        public Builder validateCertificate(@Nullable Output<Boolean> validateCertificate) {
            $.validateCertificate = validateCertificate;
            return this;
        }

        /**
         * @param validateCertificate Specifies whether to verify the SSL certificate of the SAP HANA database.
         * 
         * @return builder
         * 
         */
        public Builder validateCertificate(Boolean validateCertificate) {
            return validateCertificate(Output.of(validateCertificate));
        }

        /**
         * @param vaultId The ID of the backup vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(Output<String> vaultId) {
            $.vaultId = vaultId;
            return this;
        }

        /**
         * @param vaultId The ID of the backup vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(String vaultId) {
            return vaultId(Output.of(vaultId));
        }

        public HanaInstanceArgs build() {
            $.vaultId = Objects.requireNonNull($.vaultId, "expected parameter 'vaultId' to be non-null");
            return $;
        }
    }

}
