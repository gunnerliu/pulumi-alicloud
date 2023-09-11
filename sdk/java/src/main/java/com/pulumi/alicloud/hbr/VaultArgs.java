// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VaultArgs extends com.pulumi.resources.ResourceArgs {

    public static final VaultArgs Empty = new VaultArgs();

    /**
     * The description of Vault. Defaults to an empty string.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of Vault. Defaults to an empty string.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Source Encryption Type，It is valid only when vault_type is `STANDARD` or `OTS_BACKUP`. Default value: `HBR_PRIVATE`. Valid values:
     * 
     */
    @Import(name="encryptType")
    private @Nullable Output<String> encryptType;

    /**
     * @return Source Encryption Type，It is valid only when vault_type is `STANDARD` or `OTS_BACKUP`. Default value: `HBR_PRIVATE`. Valid values:
     * 
     */
    public Optional<Output<String>> encryptType() {
        return Optional.ofNullable(this.encryptType);
    }

    /**
     * The key id or alias name of Alibaba Cloud Kms. It is required and valid only when encrypt_type is `KMS`.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The key id or alias name of Alibaba Cloud Kms. It is required and valid only when encrypt_type is `KMS`.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The name of Vault.
     * 
     */
    @Import(name="vaultName", required=true)
    private Output<String> vaultName;

    /**
     * @return The name of Vault.
     * 
     */
    public Output<String> vaultName() {
        return this.vaultName;
    }

    /**
     * The storage class of Vault. Valid values: `STANDARD`.
     * 
     */
    @Import(name="vaultStorageClass")
    private @Nullable Output<String> vaultStorageClass;

    /**
     * @return The storage class of Vault. Valid values: `STANDARD`.
     * 
     */
    public Optional<Output<String>> vaultStorageClass() {
        return Optional.ofNullable(this.vaultStorageClass);
    }

    /**
     * The type of Vault. Valid values: `STANDARD`, `OTS_BACKUP`.
     * 
     */
    @Import(name="vaultType")
    private @Nullable Output<String> vaultType;

    /**
     * @return The type of Vault. Valid values: `STANDARD`, `OTS_BACKUP`.
     * 
     */
    public Optional<Output<String>> vaultType() {
        return Optional.ofNullable(this.vaultType);
    }

    private VaultArgs() {}

    private VaultArgs(VaultArgs $) {
        this.description = $.description;
        this.encryptType = $.encryptType;
        this.kmsKeyId = $.kmsKeyId;
        this.vaultName = $.vaultName;
        this.vaultStorageClass = $.vaultStorageClass;
        this.vaultType = $.vaultType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VaultArgs $;

        public Builder() {
            $ = new VaultArgs();
        }

        public Builder(VaultArgs defaults) {
            $ = new VaultArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of Vault. Defaults to an empty string.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of Vault. Defaults to an empty string.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param encryptType Source Encryption Type，It is valid only when vault_type is `STANDARD` or `OTS_BACKUP`. Default value: `HBR_PRIVATE`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder encryptType(@Nullable Output<String> encryptType) {
            $.encryptType = encryptType;
            return this;
        }

        /**
         * @param encryptType Source Encryption Type，It is valid only when vault_type is `STANDARD` or `OTS_BACKUP`. Default value: `HBR_PRIVATE`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder encryptType(String encryptType) {
            return encryptType(Output.of(encryptType));
        }

        /**
         * @param kmsKeyId The key id or alias name of Alibaba Cloud Kms. It is required and valid only when encrypt_type is `KMS`.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The key id or alias name of Alibaba Cloud Kms. It is required and valid only when encrypt_type is `KMS`.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param vaultName The name of Vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(Output<String> vaultName) {
            $.vaultName = vaultName;
            return this;
        }

        /**
         * @param vaultName The name of Vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(String vaultName) {
            return vaultName(Output.of(vaultName));
        }

        /**
         * @param vaultStorageClass The storage class of Vault. Valid values: `STANDARD`.
         * 
         * @return builder
         * 
         */
        public Builder vaultStorageClass(@Nullable Output<String> vaultStorageClass) {
            $.vaultStorageClass = vaultStorageClass;
            return this;
        }

        /**
         * @param vaultStorageClass The storage class of Vault. Valid values: `STANDARD`.
         * 
         * @return builder
         * 
         */
        public Builder vaultStorageClass(String vaultStorageClass) {
            return vaultStorageClass(Output.of(vaultStorageClass));
        }

        /**
         * @param vaultType The type of Vault. Valid values: `STANDARD`, `OTS_BACKUP`.
         * 
         * @return builder
         * 
         */
        public Builder vaultType(@Nullable Output<String> vaultType) {
            $.vaultType = vaultType;
            return this;
        }

        /**
         * @param vaultType The type of Vault. Valid values: `STANDARD`, `OTS_BACKUP`.
         * 
         * @return builder
         * 
         */
        public Builder vaultType(String vaultType) {
            return vaultType(Output.of(vaultType));
        }

        public VaultArgs build() {
            $.vaultName = Objects.requireNonNull($.vaultName, "expected parameter 'vaultName' to be non-null");
            return $;
        }
    }

}
