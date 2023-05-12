// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkAclsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkAclsPlainArgs Empty = new GetNetworkAclsPlainArgs();

    /**
     * A list of Network Acl ID.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Network Acl ID.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Network Acl name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Network Acl name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * The name of the network ACL.
     * 
     */
    @Import(name="networkAclName")
    private @Nullable String networkAclName;

    /**
     * @return The name of the network ACL.
     * 
     */
    public Optional<String> networkAclName() {
        return Optional.ofNullable(this.networkAclName);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The ID of the associated resource.
     * 
     */
    @Import(name="resourceId")
    private @Nullable String resourceId;

    /**
     * @return The ID of the associated resource.
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * The type of the associated resource.
     * 
     */
    @Import(name="resourceType")
    private @Nullable String resourceType;

    /**
     * @return The type of the associated resource.
     * 
     */
    public Optional<String> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * The state of the network ACL.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The state of the network ACL.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The ID of the associated VPC.
     * 
     */
    @Import(name="vpcId")
    private @Nullable String vpcId;

    /**
     * @return The ID of the associated VPC.
     * 
     */
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private GetNetworkAclsPlainArgs() {}

    private GetNetworkAclsPlainArgs(GetNetworkAclsPlainArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.networkAclName = $.networkAclName;
        this.outputFile = $.outputFile;
        this.resourceId = $.resourceId;
        this.resourceType = $.resourceType;
        this.status = $.status;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkAclsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkAclsPlainArgs $;

        public Builder() {
            $ = new GetNetworkAclsPlainArgs();
        }

        public Builder(GetNetworkAclsPlainArgs defaults) {
            $ = new GetNetworkAclsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Network Acl ID.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Network Acl ID.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Network Acl name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param networkAclName The name of the network ACL.
         * 
         * @return builder
         * 
         */
        public Builder networkAclName(@Nullable String networkAclName) {
            $.networkAclName = networkAclName;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param resourceId The ID of the associated resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable String resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceType The type of the associated resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable String resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param status The state of the network ACL.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param vpcId The ID of the associated VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable String vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public GetNetworkAclsPlainArgs build() {
            return $;
        }
    }

}
