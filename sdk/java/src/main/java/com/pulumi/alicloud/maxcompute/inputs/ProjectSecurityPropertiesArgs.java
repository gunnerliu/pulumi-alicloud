// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.maxcompute.inputs;

import com.pulumi.alicloud.maxcompute.inputs.ProjectSecurityPropertiesProjectProtectionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectSecurityPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectSecurityPropertiesArgs Empty = new ProjectSecurityPropertiesArgs();

    /**
     * Whether to enable download permission check.
     * 
     */
    @Import(name="enableDownloadPrivilege")
    private @Nullable Output<Boolean> enableDownloadPrivilege;

    /**
     * @return Whether to enable download permission check.
     * 
     */
    public Optional<Output<Boolean>> enableDownloadPrivilege() {
        return Optional.ofNullable(this.enableDownloadPrivilege);
    }

    /**
     * Label authorization.
     * 
     */
    @Import(name="labelSecurity")
    private @Nullable Output<Boolean> labelSecurity;

    /**
     * @return Label authorization.
     * 
     */
    public Optional<Output<Boolean>> labelSecurity() {
        return Optional.ofNullable(this.labelSecurity);
    }

    /**
     * Project creator permissions.
     * 
     */
    @Import(name="objectCreatorHasAccessPermission")
    private @Nullable Output<Boolean> objectCreatorHasAccessPermission;

    /**
     * @return Project creator permissions.
     * 
     */
    public Optional<Output<Boolean>> objectCreatorHasAccessPermission() {
        return Optional.ofNullable(this.objectCreatorHasAccessPermission);
    }

    /**
     * Does the project creator have authorization rights.
     * 
     */
    @Import(name="objectCreatorHasGrantPermission")
    private @Nullable Output<Boolean> objectCreatorHasGrantPermission;

    /**
     * @return Does the project creator have authorization rights.
     * 
     */
    public Optional<Output<Boolean>> objectCreatorHasGrantPermission() {
        return Optional.ofNullable(this.objectCreatorHasGrantPermission);
    }

    /**
     * Project protection. See `project_protection` below.
     * 
     */
    @Import(name="projectProtection")
    private @Nullable Output<ProjectSecurityPropertiesProjectProtectionArgs> projectProtection;

    /**
     * @return Project protection. See `project_protection` below.
     * 
     */
    public Optional<Output<ProjectSecurityPropertiesProjectProtectionArgs>> projectProtection() {
        return Optional.ofNullable(this.projectProtection);
    }

    /**
     * Whether to turn on ACL.
     * 
     */
    @Import(name="usingAcl")
    private @Nullable Output<Boolean> usingAcl;

    /**
     * @return Whether to turn on ACL.
     * 
     */
    public Optional<Output<Boolean>> usingAcl() {
        return Optional.ofNullable(this.usingAcl);
    }

    /**
     * Whether to enable Policy.
     * 
     */
    @Import(name="usingPolicy")
    private @Nullable Output<Boolean> usingPolicy;

    /**
     * @return Whether to enable Policy.
     * 
     */
    public Optional<Output<Boolean>> usingPolicy() {
        return Optional.ofNullable(this.usingPolicy);
    }

    private ProjectSecurityPropertiesArgs() {}

    private ProjectSecurityPropertiesArgs(ProjectSecurityPropertiesArgs $) {
        this.enableDownloadPrivilege = $.enableDownloadPrivilege;
        this.labelSecurity = $.labelSecurity;
        this.objectCreatorHasAccessPermission = $.objectCreatorHasAccessPermission;
        this.objectCreatorHasGrantPermission = $.objectCreatorHasGrantPermission;
        this.projectProtection = $.projectProtection;
        this.usingAcl = $.usingAcl;
        this.usingPolicy = $.usingPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectSecurityPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectSecurityPropertiesArgs $;

        public Builder() {
            $ = new ProjectSecurityPropertiesArgs();
        }

        public Builder(ProjectSecurityPropertiesArgs defaults) {
            $ = new ProjectSecurityPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableDownloadPrivilege Whether to enable download permission check.
         * 
         * @return builder
         * 
         */
        public Builder enableDownloadPrivilege(@Nullable Output<Boolean> enableDownloadPrivilege) {
            $.enableDownloadPrivilege = enableDownloadPrivilege;
            return this;
        }

        /**
         * @param enableDownloadPrivilege Whether to enable download permission check.
         * 
         * @return builder
         * 
         */
        public Builder enableDownloadPrivilege(Boolean enableDownloadPrivilege) {
            return enableDownloadPrivilege(Output.of(enableDownloadPrivilege));
        }

        /**
         * @param labelSecurity Label authorization.
         * 
         * @return builder
         * 
         */
        public Builder labelSecurity(@Nullable Output<Boolean> labelSecurity) {
            $.labelSecurity = labelSecurity;
            return this;
        }

        /**
         * @param labelSecurity Label authorization.
         * 
         * @return builder
         * 
         */
        public Builder labelSecurity(Boolean labelSecurity) {
            return labelSecurity(Output.of(labelSecurity));
        }

        /**
         * @param objectCreatorHasAccessPermission Project creator permissions.
         * 
         * @return builder
         * 
         */
        public Builder objectCreatorHasAccessPermission(@Nullable Output<Boolean> objectCreatorHasAccessPermission) {
            $.objectCreatorHasAccessPermission = objectCreatorHasAccessPermission;
            return this;
        }

        /**
         * @param objectCreatorHasAccessPermission Project creator permissions.
         * 
         * @return builder
         * 
         */
        public Builder objectCreatorHasAccessPermission(Boolean objectCreatorHasAccessPermission) {
            return objectCreatorHasAccessPermission(Output.of(objectCreatorHasAccessPermission));
        }

        /**
         * @param objectCreatorHasGrantPermission Does the project creator have authorization rights.
         * 
         * @return builder
         * 
         */
        public Builder objectCreatorHasGrantPermission(@Nullable Output<Boolean> objectCreatorHasGrantPermission) {
            $.objectCreatorHasGrantPermission = objectCreatorHasGrantPermission;
            return this;
        }

        /**
         * @param objectCreatorHasGrantPermission Does the project creator have authorization rights.
         * 
         * @return builder
         * 
         */
        public Builder objectCreatorHasGrantPermission(Boolean objectCreatorHasGrantPermission) {
            return objectCreatorHasGrantPermission(Output.of(objectCreatorHasGrantPermission));
        }

        /**
         * @param projectProtection Project protection. See `project_protection` below.
         * 
         * @return builder
         * 
         */
        public Builder projectProtection(@Nullable Output<ProjectSecurityPropertiesProjectProtectionArgs> projectProtection) {
            $.projectProtection = projectProtection;
            return this;
        }

        /**
         * @param projectProtection Project protection. See `project_protection` below.
         * 
         * @return builder
         * 
         */
        public Builder projectProtection(ProjectSecurityPropertiesProjectProtectionArgs projectProtection) {
            return projectProtection(Output.of(projectProtection));
        }

        /**
         * @param usingAcl Whether to turn on ACL.
         * 
         * @return builder
         * 
         */
        public Builder usingAcl(@Nullable Output<Boolean> usingAcl) {
            $.usingAcl = usingAcl;
            return this;
        }

        /**
         * @param usingAcl Whether to turn on ACL.
         * 
         * @return builder
         * 
         */
        public Builder usingAcl(Boolean usingAcl) {
            return usingAcl(Output.of(usingAcl));
        }

        /**
         * @param usingPolicy Whether to enable Policy.
         * 
         * @return builder
         * 
         */
        public Builder usingPolicy(@Nullable Output<Boolean> usingPolicy) {
            $.usingPolicy = usingPolicy;
            return this;
        }

        /**
         * @param usingPolicy Whether to enable Policy.
         * 
         * @return builder
         * 
         */
        public Builder usingPolicy(Boolean usingPolicy) {
            return usingPolicy(Output.of(usingPolicy));
        }

        public ProjectSecurityPropertiesArgs build() {
            return $;
        }
    }

}
