// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dfs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessGroupArgs Empty = new AccessGroupArgs();

    /**
     * The Name of Access Group.The length of `access_group_name` does not exceed 100 bytes.
     * 
     */
    @Import(name="accessGroupName", required=true)
    private Output<String> accessGroupName;

    /**
     * @return The Name of Access Group.The length of `access_group_name` does not exceed 100 bytes.
     * 
     */
    public Output<String> accessGroupName() {
        return this.accessGroupName;
    }

    /**
     * The Description of Access Group. The length of `description` does not exceed 100 bytes.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The Description of Access Group. The length of `description` does not exceed 100 bytes.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The NetworkType of Access Group. Valid values: `VPC`.
     * 
     */
    @Import(name="networkType", required=true)
    private Output<String> networkType;

    /**
     * @return The NetworkType of Access Group. Valid values: `VPC`.
     * 
     */
    public Output<String> networkType() {
        return this.networkType;
    }

    private AccessGroupArgs() {}

    private AccessGroupArgs(AccessGroupArgs $) {
        this.accessGroupName = $.accessGroupName;
        this.description = $.description;
        this.networkType = $.networkType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessGroupArgs $;

        public Builder() {
            $ = new AccessGroupArgs();
        }

        public Builder(AccessGroupArgs defaults) {
            $ = new AccessGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessGroupName The Name of Access Group.The length of `access_group_name` does not exceed 100 bytes.
         * 
         * @return builder
         * 
         */
        public Builder accessGroupName(Output<String> accessGroupName) {
            $.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * @param accessGroupName The Name of Access Group.The length of `access_group_name` does not exceed 100 bytes.
         * 
         * @return builder
         * 
         */
        public Builder accessGroupName(String accessGroupName) {
            return accessGroupName(Output.of(accessGroupName));
        }

        /**
         * @param description The Description of Access Group. The length of `description` does not exceed 100 bytes.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The Description of Access Group. The length of `description` does not exceed 100 bytes.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param networkType The NetworkType of Access Group. Valid values: `VPC`.
         * 
         * @return builder
         * 
         */
        public Builder networkType(Output<String> networkType) {
            $.networkType = networkType;
            return this;
        }

        /**
         * @param networkType The NetworkType of Access Group. Valid values: `VPC`.
         * 
         * @return builder
         * 
         */
        public Builder networkType(String networkType) {
            return networkType(Output.of(networkType));
        }

        public AccessGroupArgs build() {
            $.accessGroupName = Objects.requireNonNull($.accessGroupName, "expected parameter 'accessGroupName' to be non-null");
            $.networkType = Objects.requireNonNull($.networkType, "expected parameter 'networkType' to be non-null");
            return $;
        }
    }

}
