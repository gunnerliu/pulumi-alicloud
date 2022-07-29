// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReplicationVaultState extends com.pulumi.resources.ResourceArgs {

    public static final ReplicationVaultState Empty = new ReplicationVaultState();

    /**
     * The description of the backup vault. The description must be 0 to 255 characters in length.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the backup vault. The description must be 0 to 255 characters in length.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the region where the source vault resides.
     * 
     */
    @Import(name="replicationSourceRegionId")
    private @Nullable Output<String> replicationSourceRegionId;

    /**
     * @return The ID of the region where the source vault resides.
     * 
     */
    public Optional<Output<String>> replicationSourceRegionId() {
        return Optional.ofNullable(this.replicationSourceRegionId);
    }

    /**
     * The ID of the source vault.
     * 
     */
    @Import(name="replicationSourceVaultId")
    private @Nullable Output<String> replicationSourceVaultId;

    /**
     * @return The ID of the source vault.
     * 
     */
    public Optional<Output<String>> replicationSourceVaultId() {
        return Optional.ofNullable(this.replicationSourceVaultId);
    }

    /**
     * The status of the resource.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The name of the backup vault. The name must be 1 to 64 characters in length.
     * 
     */
    @Import(name="vaultName")
    private @Nullable Output<String> vaultName;

    /**
     * @return The name of the backup vault. The name must be 1 to 64 characters in length.
     * 
     */
    public Optional<Output<String>> vaultName() {
        return Optional.ofNullable(this.vaultName);
    }

    /**
     * The storage type of the backup vault. Valid values: `STANDARD`.
     * 
     */
    @Import(name="vaultStorageClass")
    private @Nullable Output<String> vaultStorageClass;

    /**
     * @return The storage type of the backup vault. Valid values: `STANDARD`.
     * 
     */
    public Optional<Output<String>> vaultStorageClass() {
        return Optional.ofNullable(this.vaultStorageClass);
    }

    private ReplicationVaultState() {}

    private ReplicationVaultState(ReplicationVaultState $) {
        this.description = $.description;
        this.replicationSourceRegionId = $.replicationSourceRegionId;
        this.replicationSourceVaultId = $.replicationSourceVaultId;
        this.status = $.status;
        this.vaultName = $.vaultName;
        this.vaultStorageClass = $.vaultStorageClass;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationVaultState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationVaultState $;

        public Builder() {
            $ = new ReplicationVaultState();
        }

        public Builder(ReplicationVaultState defaults) {
            $ = new ReplicationVaultState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the backup vault. The description must be 0 to 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the backup vault. The description must be 0 to 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param replicationSourceRegionId The ID of the region where the source vault resides.
         * 
         * @return builder
         * 
         */
        public Builder replicationSourceRegionId(@Nullable Output<String> replicationSourceRegionId) {
            $.replicationSourceRegionId = replicationSourceRegionId;
            return this;
        }

        /**
         * @param replicationSourceRegionId The ID of the region where the source vault resides.
         * 
         * @return builder
         * 
         */
        public Builder replicationSourceRegionId(String replicationSourceRegionId) {
            return replicationSourceRegionId(Output.of(replicationSourceRegionId));
        }

        /**
         * @param replicationSourceVaultId The ID of the source vault.
         * 
         * @return builder
         * 
         */
        public Builder replicationSourceVaultId(@Nullable Output<String> replicationSourceVaultId) {
            $.replicationSourceVaultId = replicationSourceVaultId;
            return this;
        }

        /**
         * @param replicationSourceVaultId The ID of the source vault.
         * 
         * @return builder
         * 
         */
        public Builder replicationSourceVaultId(String replicationSourceVaultId) {
            return replicationSourceVaultId(Output.of(replicationSourceVaultId));
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param vaultName The name of the backup vault. The name must be 1 to 64 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(@Nullable Output<String> vaultName) {
            $.vaultName = vaultName;
            return this;
        }

        /**
         * @param vaultName The name of the backup vault. The name must be 1 to 64 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(String vaultName) {
            return vaultName(Output.of(vaultName));
        }

        /**
         * @param vaultStorageClass The storage type of the backup vault. Valid values: `STANDARD`.
         * 
         * @return builder
         * 
         */
        public Builder vaultStorageClass(@Nullable Output<String> vaultStorageClass) {
            $.vaultStorageClass = vaultStorageClass;
            return this;
        }

        /**
         * @param vaultStorageClass The storage type of the backup vault. Valid values: `STANDARD`.
         * 
         * @return builder
         * 
         */
        public Builder vaultStorageClass(String vaultStorageClass) {
            return vaultStorageClass(Output.of(vaultStorageClass));
        }

        public ReplicationVaultState build() {
            return $;
        }
    }

}
