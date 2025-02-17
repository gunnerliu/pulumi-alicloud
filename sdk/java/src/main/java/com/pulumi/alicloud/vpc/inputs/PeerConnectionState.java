// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PeerConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final PeerConnectionState Empty = new PeerConnectionState();

    /**
     * The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.
     * - Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.
     * - Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.
     * &gt; **NOTE:**  If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
     * 
     */
    @Import(name="acceptingAliUid")
    private @Nullable Output<Integer> acceptingAliUid;

    /**
     * @return The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.
     * - Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.
     * - Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.
     * &gt; **NOTE:**  If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
     * 
     */
    public Optional<Output<Integer>> acceptingAliUid() {
        return Optional.ofNullable(this.acceptingAliUid);
    }

    /**
     * The region ID of the recipient of the VPC peering connection to be created.
     * - When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.
     * - When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
     * 
     */
    @Import(name="acceptingRegionId")
    private @Nullable Output<String> acceptingRegionId;

    /**
     * @return The region ID of the recipient of the VPC peering connection to be created.
     * - When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.
     * - When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
     * 
     */
    public Optional<Output<String>> acceptingRegionId() {
        return Optional.ofNullable(this.acceptingRegionId);
    }

    /**
     * The VPC ID of the receiving end of the VPC peer connection.
     * 
     */
    @Import(name="acceptingVpcId")
    private @Nullable Output<String> acceptingVpcId;

    /**
     * @return The VPC ID of the receiving end of the VPC peer connection.
     * 
     */
    public Optional<Output<String>> acceptingVpcId() {
        return Optional.ofNullable(this.acceptingVpcId);
    }

    /**
     * The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Output<Integer> bandwidth;

    /**
     * @return The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
     * 
     */
    public Optional<Output<Integer>> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * The creation time of the VPC peer connection. Use UTC time in the format `YYYY-MM-DDThh:mm:ssZ`.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The creation time of the VPC peer connection. Use UTC time in the format `YYYY-MM-DDThh:mm:ssZ`.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether to PreCheck only this request. Default value: `false`. Valid values:
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Whether to PreCheck only this request. Default value: `false`. Valid values:
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The name of the VPC peer connection. The name of the resource. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
     * 
     */
    @Import(name="peerConnectionName")
    private @Nullable Output<String> peerConnectionName;

    /**
     * @return The name of the VPC peer connection. The name of the resource. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
     * 
     */
    public Optional<Output<String>> peerConnectionName() {
        return Optional.ofNullable(this.peerConnectionName);
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
     * The status of the VPC peer connection.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the VPC peer connection.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the requester VPC.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of the requester VPC.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private PeerConnectionState() {}

    private PeerConnectionState(PeerConnectionState $) {
        this.acceptingAliUid = $.acceptingAliUid;
        this.acceptingRegionId = $.acceptingRegionId;
        this.acceptingVpcId = $.acceptingVpcId;
        this.bandwidth = $.bandwidth;
        this.createTime = $.createTime;
        this.description = $.description;
        this.dryRun = $.dryRun;
        this.peerConnectionName = $.peerConnectionName;
        this.resourceGroupId = $.resourceGroupId;
        this.status = $.status;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PeerConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PeerConnectionState $;

        public Builder() {
            $ = new PeerConnectionState();
        }

        public Builder(PeerConnectionState defaults) {
            $ = new PeerConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptingAliUid The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.
         * - Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.
         * - Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.
         * &gt; **NOTE:**  If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
         * 
         * @return builder
         * 
         */
        public Builder acceptingAliUid(@Nullable Output<Integer> acceptingAliUid) {
            $.acceptingAliUid = acceptingAliUid;
            return this;
        }

        /**
         * @param acceptingAliUid The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.
         * - Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.
         * - Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.
         * &gt; **NOTE:**  If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
         * 
         * @return builder
         * 
         */
        public Builder acceptingAliUid(Integer acceptingAliUid) {
            return acceptingAliUid(Output.of(acceptingAliUid));
        }

        /**
         * @param acceptingRegionId The region ID of the recipient of the VPC peering connection to be created.
         * - When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.
         * - When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
         * 
         * @return builder
         * 
         */
        public Builder acceptingRegionId(@Nullable Output<String> acceptingRegionId) {
            $.acceptingRegionId = acceptingRegionId;
            return this;
        }

        /**
         * @param acceptingRegionId The region ID of the recipient of the VPC peering connection to be created.
         * - When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.
         * - When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
         * 
         * @return builder
         * 
         */
        public Builder acceptingRegionId(String acceptingRegionId) {
            return acceptingRegionId(Output.of(acceptingRegionId));
        }

        /**
         * @param acceptingVpcId The VPC ID of the receiving end of the VPC peer connection.
         * 
         * @return builder
         * 
         */
        public Builder acceptingVpcId(@Nullable Output<String> acceptingVpcId) {
            $.acceptingVpcId = acceptingVpcId;
            return this;
        }

        /**
         * @param acceptingVpcId The VPC ID of the receiving end of the VPC peer connection.
         * 
         * @return builder
         * 
         */
        public Builder acceptingVpcId(String acceptingVpcId) {
            return acceptingVpcId(Output.of(acceptingVpcId));
        }

        /**
         * @param bandwidth The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(@Nullable Output<Integer> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Integer bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param createTime The creation time of the VPC peer connection. Use UTC time in the format `YYYY-MM-DDThh:mm:ssZ`.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The creation time of the VPC peer connection. Use UTC time in the format `YYYY-MM-DDThh:mm:ssZ`.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param dryRun Whether to PreCheck only this request. Default value: `false`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Whether to PreCheck only this request. Default value: `false`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param peerConnectionName The name of the VPC peer connection. The name of the resource. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder peerConnectionName(@Nullable Output<String> peerConnectionName) {
            $.peerConnectionName = peerConnectionName;
            return this;
        }

        /**
         * @param peerConnectionName The name of the VPC peer connection. The name of the resource. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder peerConnectionName(String peerConnectionName) {
            return peerConnectionName(Output.of(peerConnectionName));
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
         * @param status The status of the VPC peer connection.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the VPC peer connection.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcId The ID of the requester VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the requester VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public PeerConnectionState build() {
            return $;
        }
    }

}
