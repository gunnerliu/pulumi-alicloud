// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudsso;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessManagementArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessManagementArgs Empty = new AccessManagementArgs();

    /**
     * The Access configuration ID.
     * 
     */
    @Import(name="accessConfigurationId", required=true)
    private Output<String> accessConfigurationId;

    /**
     * @return The Access configuration ID.
     * 
     */
    public Output<String> accessConfigurationId() {
        return this.accessConfigurationId;
    }

    /**
     * The deprovision strategy. Valid values: `DeprovisionForLastAccessAssignmentOnAccount` and `None`. Default Value: `DeprovisionForLastAccessAssignmentOnAccount`. **NOTE:** When `deprovision_strategy` is `DeprovisionForLastAccessAssignmentOnAccount`, and the access assignment to be deleted is the last access assignment for the same account and the same AC, this option is used for the undeployment operation。
     * 
     */
    @Import(name="deprovisionStrategy")
    private @Nullable Output<String> deprovisionStrategy;

    /**
     * @return The deprovision strategy. Valid values: `DeprovisionForLastAccessAssignmentOnAccount` and `None`. Default Value: `DeprovisionForLastAccessAssignmentOnAccount`. **NOTE:** When `deprovision_strategy` is `DeprovisionForLastAccessAssignmentOnAccount`, and the access assignment to be deleted is the last access assignment for the same account and the same AC, this option is used for the undeployment operation。
     * 
     */
    public Optional<Output<String>> deprovisionStrategy() {
        return Optional.ofNullable(this.deprovisionStrategy);
    }

    /**
     * The ID of the Directory.
     * 
     */
    @Import(name="directoryId", required=true)
    private Output<String> directoryId;

    /**
     * @return The ID of the Directory.
     * 
     */
    public Output<String> directoryId() {
        return this.directoryId;
    }

    /**
     * The ID of the access assignment.
     * 
     */
    @Import(name="principalId", required=true)
    private Output<String> principalId;

    /**
     * @return The ID of the access assignment.
     * 
     */
    public Output<String> principalId() {
        return this.principalId;
    }

    /**
     * The identity type of the access assignment, which can be a user or a user group. Valid values: `Group`, `User`.
     * 
     */
    @Import(name="principalType", required=true)
    private Output<String> principalType;

    /**
     * @return The identity type of the access assignment, which can be a user or a user group. Valid values: `Group`, `User`.
     * 
     */
    public Output<String> principalType() {
        return this.principalType;
    }

    /**
     * The ID of the target to create the resource range.
     * 
     */
    @Import(name="targetId", required=true)
    private Output<String> targetId;

    /**
     * @return The ID of the target to create the resource range.
     * 
     */
    public Output<String> targetId() {
        return this.targetId;
    }

    /**
     * The type of the resource range target to be accessed. Valid values: `RD-Account`.
     * 
     */
    @Import(name="targetType", required=true)
    private Output<String> targetType;

    /**
     * @return The type of the resource range target to be accessed. Valid values: `RD-Account`.
     * 
     */
    public Output<String> targetType() {
        return this.targetType;
    }

    private AccessManagementArgs() {}

    private AccessManagementArgs(AccessManagementArgs $) {
        this.accessConfigurationId = $.accessConfigurationId;
        this.deprovisionStrategy = $.deprovisionStrategy;
        this.directoryId = $.directoryId;
        this.principalId = $.principalId;
        this.principalType = $.principalType;
        this.targetId = $.targetId;
        this.targetType = $.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessManagementArgs $;

        public Builder() {
            $ = new AccessManagementArgs();
        }

        public Builder(AccessManagementArgs defaults) {
            $ = new AccessManagementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessConfigurationId The Access configuration ID.
         * 
         * @return builder
         * 
         */
        public Builder accessConfigurationId(Output<String> accessConfigurationId) {
            $.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * @param accessConfigurationId The Access configuration ID.
         * 
         * @return builder
         * 
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            return accessConfigurationId(Output.of(accessConfigurationId));
        }

        /**
         * @param deprovisionStrategy The deprovision strategy. Valid values: `DeprovisionForLastAccessAssignmentOnAccount` and `None`. Default Value: `DeprovisionForLastAccessAssignmentOnAccount`. **NOTE:** When `deprovision_strategy` is `DeprovisionForLastAccessAssignmentOnAccount`, and the access assignment to be deleted is the last access assignment for the same account and the same AC, this option is used for the undeployment operation。
         * 
         * @return builder
         * 
         */
        public Builder deprovisionStrategy(@Nullable Output<String> deprovisionStrategy) {
            $.deprovisionStrategy = deprovisionStrategy;
            return this;
        }

        /**
         * @param deprovisionStrategy The deprovision strategy. Valid values: `DeprovisionForLastAccessAssignmentOnAccount` and `None`. Default Value: `DeprovisionForLastAccessAssignmentOnAccount`. **NOTE:** When `deprovision_strategy` is `DeprovisionForLastAccessAssignmentOnAccount`, and the access assignment to be deleted is the last access assignment for the same account and the same AC, this option is used for the undeployment operation。
         * 
         * @return builder
         * 
         */
        public Builder deprovisionStrategy(String deprovisionStrategy) {
            return deprovisionStrategy(Output.of(deprovisionStrategy));
        }

        /**
         * @param directoryId The ID of the Directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(Output<String> directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        /**
         * @param directoryId The ID of the Directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(String directoryId) {
            return directoryId(Output.of(directoryId));
        }

        /**
         * @param principalId The ID of the access assignment.
         * 
         * @return builder
         * 
         */
        public Builder principalId(Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The ID of the access assignment.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param principalType The identity type of the access assignment, which can be a user or a user group. Valid values: `Group`, `User`.
         * 
         * @return builder
         * 
         */
        public Builder principalType(Output<String> principalType) {
            $.principalType = principalType;
            return this;
        }

        /**
         * @param principalType The identity type of the access assignment, which can be a user or a user group. Valid values: `Group`, `User`.
         * 
         * @return builder
         * 
         */
        public Builder principalType(String principalType) {
            return principalType(Output.of(principalType));
        }

        /**
         * @param targetId The ID of the target to create the resource range.
         * 
         * @return builder
         * 
         */
        public Builder targetId(Output<String> targetId) {
            $.targetId = targetId;
            return this;
        }

        /**
         * @param targetId The ID of the target to create the resource range.
         * 
         * @return builder
         * 
         */
        public Builder targetId(String targetId) {
            return targetId(Output.of(targetId));
        }

        /**
         * @param targetType The type of the resource range target to be accessed. Valid values: `RD-Account`.
         * 
         * @return builder
         * 
         */
        public Builder targetType(Output<String> targetType) {
            $.targetType = targetType;
            return this;
        }

        /**
         * @param targetType The type of the resource range target to be accessed. Valid values: `RD-Account`.
         * 
         * @return builder
         * 
         */
        public Builder targetType(String targetType) {
            return targetType(Output.of(targetType));
        }

        public AccessManagementArgs build() {
            $.accessConfigurationId = Objects.requireNonNull($.accessConfigurationId, "expected parameter 'accessConfigurationId' to be non-null");
            $.directoryId = Objects.requireNonNull($.directoryId, "expected parameter 'directoryId' to be non-null");
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            $.principalType = Objects.requireNonNull($.principalType, "expected parameter 'principalType' to be non-null");
            $.targetId = Objects.requireNonNull($.targetId, "expected parameter 'targetId' to be non-null");
            $.targetType = Objects.requireNonNull($.targetType, "expected parameter 'targetType' to be non-null");
            return $;
        }
    }

}
