// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.alicloud.cs.outputs.GetKubernetesPermissionPermission;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetKubernetesPermissionResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of user permission.
     * 
     */
    private final @Nullable List<GetKubernetesPermissionPermission> permissions;
    /**
     * @return The ID of the RAM user. If you want to query the permissions of a RAM role, specify the ID of the RAM role.
     * 
     */
    private final String uid;

    @CustomType.Constructor
    private GetKubernetesPermissionResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("permissions") @Nullable List<GetKubernetesPermissionPermission> permissions,
        @CustomType.Parameter("uid") String uid) {
        this.id = id;
        this.permissions = permissions;
        this.uid = uid;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of user permission.
     * 
     */
    public List<GetKubernetesPermissionPermission> permissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }
    /**
     * @return The ID of the RAM user. If you want to query the permissions of a RAM role, specify the ID of the RAM role.
     * 
     */
    public String uid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesPermissionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable List<GetKubernetesPermissionPermission> permissions;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKubernetesPermissionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.permissions = defaults.permissions;
    	      this.uid = defaults.uid;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder permissions(@Nullable List<GetKubernetesPermissionPermission> permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(GetKubernetesPermissionPermission... permissions) {
            return permissions(List.of(permissions));
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }        public GetKubernetesPermissionResult build() {
            return new GetKubernetesPermissionResult(id, permissions, uid);
        }
    }
}
