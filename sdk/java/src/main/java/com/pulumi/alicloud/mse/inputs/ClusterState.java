// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * The whitelist. **NOTE:** This attribute is invalid when the value of `pub_network_flow` is `0` and the value of `net_type` is `privatenet`.
     * 
     */
    @Import(name="aclEntryLists")
    private @Nullable Output<List<String>> aclEntryLists;

    /**
     * @return The whitelist. **NOTE:** This attribute is invalid when the value of `pub_network_flow` is `0` and the value of `net_type` is `privatenet`.
     * 
     */
    public Optional<Output<List<String>>> aclEntryLists() {
        return Optional.ofNullable(this.aclEntryLists);
    }

    /**
     * The alias of MSE Cluster.
     * 
     */
    @Import(name="clusterAliasName")
    private @Nullable Output<String> clusterAliasName;

    /**
     * @return The alias of MSE Cluster.
     * 
     */
    public Optional<Output<String>> clusterAliasName() {
        return Optional.ofNullable(this.clusterAliasName);
    }

    /**
     * (Available in v1.162.0+)  The id of Cluster.
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return (Available in v1.162.0+)  The id of Cluster.
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * The engine specification of MSE Cluster. Valid values:
     * `MSE_SC_1_2_200_c`：1C2G
     * `MSE_SC_2_4_200_c`：2C4G
     * `MSE_SC_4_8_200_c`：4C8G
     * `MSE_SC_8_16_200_c`：8C16G
     * 
     */
    @Import(name="clusterSpecification")
    private @Nullable Output<String> clusterSpecification;

    /**
     * @return The engine specification of MSE Cluster. Valid values:
     * `MSE_SC_1_2_200_c`：1C2G
     * `MSE_SC_2_4_200_c`：2C4G
     * `MSE_SC_4_8_200_c`：4C8G
     * `MSE_SC_8_16_200_c`：8C16G
     * 
     */
    public Optional<Output<String>> clusterSpecification() {
        return Optional.ofNullable(this.clusterSpecification);
    }

    /**
     * The type of MSE Cluster.
     * 
     */
    @Import(name="clusterType")
    private @Nullable Output<String> clusterType;

    /**
     * @return The type of MSE Cluster.
     * 
     */
    public Optional<Output<String>> clusterType() {
        return Optional.ofNullable(this.clusterType);
    }

    /**
     * The version of MSE Cluster.
     * 
     */
    @Import(name="clusterVersion")
    private @Nullable Output<String> clusterVersion;

    /**
     * @return The version of MSE Cluster.
     * 
     */
    public Optional<Output<String>> clusterVersion() {
        return Optional.ofNullable(this.clusterVersion);
    }

    /**
     * The type of Disk.
     * 
     */
    @Import(name="diskType")
    private @Nullable Output<String> diskType;

    /**
     * @return The type of Disk.
     * 
     */
    public Optional<Output<String>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    /**
     * The count of instance.
     * 
     */
    @Import(name="instanceCount")
    private @Nullable Output<Integer> instanceCount;

    /**
     * @return The count of instance.
     * 
     */
    public Optional<Output<Integer>> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }

    /**
     * The version of MSE. Valid values: `mse_basic` or `mse_pro`.
     * 
     */
    @Import(name="mseVersion")
    private @Nullable Output<String> mseVersion;

    /**
     * @return The version of MSE. Valid values: `mse_basic` or `mse_pro`.
     * 
     */
    public Optional<Output<String>> mseVersion() {
        return Optional.ofNullable(this.mseVersion);
    }

    /**
     * The type of network. Valid values: &#34;privatenet&#34; and &#34;pubnet&#34;.
     * 
     */
    @Import(name="netType")
    private @Nullable Output<String> netType;

    /**
     * @return The type of network. Valid values: &#34;privatenet&#34; and &#34;pubnet&#34;.
     * 
     */
    public Optional<Output<String>> netType() {
        return Optional.ofNullable(this.netType);
    }

    /**
     * The specification of private network SLB.
     * 
     */
    @Import(name="privateSlbSpecification")
    private @Nullable Output<String> privateSlbSpecification;

    /**
     * @return The specification of private network SLB.
     * 
     */
    public Optional<Output<String>> privateSlbSpecification() {
        return Optional.ofNullable(this.privateSlbSpecification);
    }

    /**
     * The public network bandwidth. `0` means no access to the public network.
     * 
     */
    @Import(name="pubNetworkFlow")
    private @Nullable Output<String> pubNetworkFlow;

    /**
     * @return The public network bandwidth. `0` means no access to the public network.
     * 
     */
    public Optional<Output<String>> pubNetworkFlow() {
        return Optional.ofNullable(this.pubNetworkFlow);
    }

    /**
     * The specification of public network SLB.
     * 
     */
    @Import(name="pubSlbSpecification")
    private @Nullable Output<String> pubSlbSpecification;

    /**
     * @return The specification of public network SLB.
     * 
     */
    public Optional<Output<String>> pubSlbSpecification() {
        return Optional.ofNullable(this.pubSlbSpecification);
    }

    /**
     * The status of MSE Cluster.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of MSE Cluster.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The id of VSwitch.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The id of VSwitch.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private ClusterState() {}

    private ClusterState(ClusterState $) {
        this.aclEntryLists = $.aclEntryLists;
        this.clusterAliasName = $.clusterAliasName;
        this.clusterId = $.clusterId;
        this.clusterSpecification = $.clusterSpecification;
        this.clusterType = $.clusterType;
        this.clusterVersion = $.clusterVersion;
        this.diskType = $.diskType;
        this.instanceCount = $.instanceCount;
        this.mseVersion = $.mseVersion;
        this.netType = $.netType;
        this.privateSlbSpecification = $.privateSlbSpecification;
        this.pubNetworkFlow = $.pubNetworkFlow;
        this.pubSlbSpecification = $.pubSlbSpecification;
        this.status = $.status;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterState $;

        public Builder() {
            $ = new ClusterState();
        }

        public Builder(ClusterState defaults) {
            $ = new ClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aclEntryLists The whitelist. **NOTE:** This attribute is invalid when the value of `pub_network_flow` is `0` and the value of `net_type` is `privatenet`.
         * 
         * @return builder
         * 
         */
        public Builder aclEntryLists(@Nullable Output<List<String>> aclEntryLists) {
            $.aclEntryLists = aclEntryLists;
            return this;
        }

        /**
         * @param aclEntryLists The whitelist. **NOTE:** This attribute is invalid when the value of `pub_network_flow` is `0` and the value of `net_type` is `privatenet`.
         * 
         * @return builder
         * 
         */
        public Builder aclEntryLists(List<String> aclEntryLists) {
            return aclEntryLists(Output.of(aclEntryLists));
        }

        /**
         * @param aclEntryLists The whitelist. **NOTE:** This attribute is invalid when the value of `pub_network_flow` is `0` and the value of `net_type` is `privatenet`.
         * 
         * @return builder
         * 
         */
        public Builder aclEntryLists(String... aclEntryLists) {
            return aclEntryLists(List.of(aclEntryLists));
        }

        /**
         * @param clusterAliasName The alias of MSE Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterAliasName(@Nullable Output<String> clusterAliasName) {
            $.clusterAliasName = clusterAliasName;
            return this;
        }

        /**
         * @param clusterAliasName The alias of MSE Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterAliasName(String clusterAliasName) {
            return clusterAliasName(Output.of(clusterAliasName));
        }

        /**
         * @param clusterId (Available in v1.162.0+)  The id of Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId (Available in v1.162.0+)  The id of Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param clusterSpecification The engine specification of MSE Cluster. Valid values:
         * `MSE_SC_1_2_200_c`：1C2G
         * `MSE_SC_2_4_200_c`：2C4G
         * `MSE_SC_4_8_200_c`：4C8G
         * `MSE_SC_8_16_200_c`：8C16G
         * 
         * @return builder
         * 
         */
        public Builder clusterSpecification(@Nullable Output<String> clusterSpecification) {
            $.clusterSpecification = clusterSpecification;
            return this;
        }

        /**
         * @param clusterSpecification The engine specification of MSE Cluster. Valid values:
         * `MSE_SC_1_2_200_c`：1C2G
         * `MSE_SC_2_4_200_c`：2C4G
         * `MSE_SC_4_8_200_c`：4C8G
         * `MSE_SC_8_16_200_c`：8C16G
         * 
         * @return builder
         * 
         */
        public Builder clusterSpecification(String clusterSpecification) {
            return clusterSpecification(Output.of(clusterSpecification));
        }

        /**
         * @param clusterType The type of MSE Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterType(@Nullable Output<String> clusterType) {
            $.clusterType = clusterType;
            return this;
        }

        /**
         * @param clusterType The type of MSE Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterType(String clusterType) {
            return clusterType(Output.of(clusterType));
        }

        /**
         * @param clusterVersion The version of MSE Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterVersion(@Nullable Output<String> clusterVersion) {
            $.clusterVersion = clusterVersion;
            return this;
        }

        /**
         * @param clusterVersion The version of MSE Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterVersion(String clusterVersion) {
            return clusterVersion(Output.of(clusterVersion));
        }

        /**
         * @param diskType The type of Disk.
         * 
         * @return builder
         * 
         */
        public Builder diskType(@Nullable Output<String> diskType) {
            $.diskType = diskType;
            return this;
        }

        /**
         * @param diskType The type of Disk.
         * 
         * @return builder
         * 
         */
        public Builder diskType(String diskType) {
            return diskType(Output.of(diskType));
        }

        /**
         * @param instanceCount The count of instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(@Nullable Output<Integer> instanceCount) {
            $.instanceCount = instanceCount;
            return this;
        }

        /**
         * @param instanceCount The count of instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(Integer instanceCount) {
            return instanceCount(Output.of(instanceCount));
        }

        /**
         * @param mseVersion The version of MSE. Valid values: `mse_basic` or `mse_pro`.
         * 
         * @return builder
         * 
         */
        public Builder mseVersion(@Nullable Output<String> mseVersion) {
            $.mseVersion = mseVersion;
            return this;
        }

        /**
         * @param mseVersion The version of MSE. Valid values: `mse_basic` or `mse_pro`.
         * 
         * @return builder
         * 
         */
        public Builder mseVersion(String mseVersion) {
            return mseVersion(Output.of(mseVersion));
        }

        /**
         * @param netType The type of network. Valid values: &#34;privatenet&#34; and &#34;pubnet&#34;.
         * 
         * @return builder
         * 
         */
        public Builder netType(@Nullable Output<String> netType) {
            $.netType = netType;
            return this;
        }

        /**
         * @param netType The type of network. Valid values: &#34;privatenet&#34; and &#34;pubnet&#34;.
         * 
         * @return builder
         * 
         */
        public Builder netType(String netType) {
            return netType(Output.of(netType));
        }

        /**
         * @param privateSlbSpecification The specification of private network SLB.
         * 
         * @return builder
         * 
         */
        public Builder privateSlbSpecification(@Nullable Output<String> privateSlbSpecification) {
            $.privateSlbSpecification = privateSlbSpecification;
            return this;
        }

        /**
         * @param privateSlbSpecification The specification of private network SLB.
         * 
         * @return builder
         * 
         */
        public Builder privateSlbSpecification(String privateSlbSpecification) {
            return privateSlbSpecification(Output.of(privateSlbSpecification));
        }

        /**
         * @param pubNetworkFlow The public network bandwidth. `0` means no access to the public network.
         * 
         * @return builder
         * 
         */
        public Builder pubNetworkFlow(@Nullable Output<String> pubNetworkFlow) {
            $.pubNetworkFlow = pubNetworkFlow;
            return this;
        }

        /**
         * @param pubNetworkFlow The public network bandwidth. `0` means no access to the public network.
         * 
         * @return builder
         * 
         */
        public Builder pubNetworkFlow(String pubNetworkFlow) {
            return pubNetworkFlow(Output.of(pubNetworkFlow));
        }

        /**
         * @param pubSlbSpecification The specification of public network SLB.
         * 
         * @return builder
         * 
         */
        public Builder pubSlbSpecification(@Nullable Output<String> pubSlbSpecification) {
            $.pubSlbSpecification = pubSlbSpecification;
            return this;
        }

        /**
         * @param pubSlbSpecification The specification of public network SLB.
         * 
         * @return builder
         * 
         */
        public Builder pubSlbSpecification(String pubSlbSpecification) {
            return pubSlbSpecification(Output.of(pubSlbSpecification));
        }

        /**
         * @param status The status of MSE Cluster.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of MSE Cluster.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param vswitchId The id of VSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The id of VSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public ClusterState build() {
            return $;
        }
    }

}
