// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKubernetesPermissionPermissionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetKubernetesPermissionPermissionArgs Empty = new GetKubernetesPermissionPermissionArgs();

    /**
     * ndicates whether the permissions are granted to the cluster owner. Valid values `0`, `1`.
     * 
     */
    @Import(name="isOwner")
    private @Nullable Output<Boolean> isOwner;

    /**
     * @return ndicates whether the permissions are granted to the cluster owner. Valid values `0`, `1`.
     * 
     */
    public Optional<Output<Boolean>> isOwner() {
        return Optional.ofNullable(this.isOwner);
    }

    /**
     * Indicates whether the permissions are granted to the RAM role. Valid values `0`,`1`.
     * 
     */
    @Import(name="isRamRole")
    private @Nullable Output<Boolean> isRamRole;

    /**
     * @return Indicates whether the permissions are granted to the RAM role. Valid values `0`,`1`.
     * 
     */
    public Optional<Output<Boolean>> isRamRole() {
        return Optional.ofNullable(this.isRamRole);
    }

    /**
     * The permission settings to manage ACK clusters.
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    /**
     * @return The permission settings to manage ACK clusters.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * The authorization type. Valid values `cluster`, `namespace` and `console`.
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    /**
     * @return The authorization type. Valid values `cluster`, `namespace` and `console`.
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }

    /**
     * The name of the predefined role. If a custom role is assigned, the value is the name of the assigined custom role.
     * 
     */
    @Import(name="roleName", required=true)
    private Output<String> roleName;

    /**
     * @return The name of the predefined role. If a custom role is assigned, the value is the name of the assigined custom role.
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }

    /**
     * The predefined role. Valid values `admin`,`ops`,`dev`,`restricted` and `custom`.
     * 
     */
    @Import(name="roleType")
    private @Nullable Output<String> roleType;

    /**
     * @return The predefined role. Valid values `admin`,`ops`,`dev`,`restricted` and `custom`.
     * 
     */
    public Optional<Output<String>> roleType() {
        return Optional.ofNullable(this.roleType);
    }

    private GetKubernetesPermissionPermissionArgs() {}

    private GetKubernetesPermissionPermissionArgs(GetKubernetesPermissionPermissionArgs $) {
        this.isOwner = $.isOwner;
        this.isRamRole = $.isRamRole;
        this.resourceId = $.resourceId;
        this.resourceType = $.resourceType;
        this.roleName = $.roleName;
        this.roleType = $.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKubernetesPermissionPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKubernetesPermissionPermissionArgs $;

        public Builder() {
            $ = new GetKubernetesPermissionPermissionArgs();
        }

        public Builder(GetKubernetesPermissionPermissionArgs defaults) {
            $ = new GetKubernetesPermissionPermissionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isOwner ndicates whether the permissions are granted to the cluster owner. Valid values `0`, `1`.
         * 
         * @return builder
         * 
         */
        public Builder isOwner(@Nullable Output<Boolean> isOwner) {
            $.isOwner = isOwner;
            return this;
        }

        /**
         * @param isOwner ndicates whether the permissions are granted to the cluster owner. Valid values `0`, `1`.
         * 
         * @return builder
         * 
         */
        public Builder isOwner(Boolean isOwner) {
            return isOwner(Output.of(isOwner));
        }

        /**
         * @param isRamRole Indicates whether the permissions are granted to the RAM role. Valid values `0`,`1`.
         * 
         * @return builder
         * 
         */
        public Builder isRamRole(@Nullable Output<Boolean> isRamRole) {
            $.isRamRole = isRamRole;
            return this;
        }

        /**
         * @param isRamRole Indicates whether the permissions are granted to the RAM role. Valid values `0`,`1`.
         * 
         * @return builder
         * 
         */
        public Builder isRamRole(Boolean isRamRole) {
            return isRamRole(Output.of(isRamRole));
        }

        /**
         * @param resourceId The permission settings to manage ACK clusters.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The permission settings to manage ACK clusters.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param resourceType The authorization type. Valid values `cluster`, `namespace` and `console`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The authorization type. Valid values `cluster`, `namespace` and `console`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param roleName The name of the predefined role. If a custom role is assigned, the value is the name of the assigined custom role.
         * 
         * @return builder
         * 
         */
        public Builder roleName(Output<String> roleName) {
            $.roleName = roleName;
            return this;
        }

        /**
         * @param roleName The name of the predefined role. If a custom role is assigned, the value is the name of the assigined custom role.
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            return roleName(Output.of(roleName));
        }

        /**
         * @param roleType The predefined role. Valid values `admin`,`ops`,`dev`,`restricted` and `custom`.
         * 
         * @return builder
         * 
         */
        public Builder roleType(@Nullable Output<String> roleType) {
            $.roleType = roleType;
            return this;
        }

        /**
         * @param roleType The predefined role. Valid values `admin`,`ops`,`dev`,`restricted` and `custom`.
         * 
         * @return builder
         * 
         */
        public Builder roleType(String roleType) {
            return roleType(Output.of(roleType));
        }

        public GetKubernetesPermissionPermissionArgs build() {
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            $.roleName = Objects.requireNonNull($.roleName, "expected parameter 'roleName' to be non-null");
            return $;
        }
    }

}
