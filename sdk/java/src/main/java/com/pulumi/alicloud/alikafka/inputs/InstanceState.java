// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alikafka.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * （Optional, Available in v1.112.0+） The basic config for this instance. The input should be json type, only the following key allowed: enable.acl, enable.vpc_sasl_ssl, kafka.log.retention.hours, kafka.message.max.bytes.
     * 
     */
    @Import(name="config")
    private @Nullable Output<String> config;

    /**
     * @return （Optional, Available in v1.112.0+） The basic config for this instance. The input should be json type, only the following key allowed: enable.acl, enable.vpc_sasl_ssl, kafka.log.retention.hours, kafka.message.max.bytes.
     * 
     */
    public Optional<Output<String>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * The deployment type of the instance. **NOTE:** From version 1.161.0, this attribute supports to be updated. Valid values:
     * - 4: eip/vpc instance
     * - 5: vpc instance.
     * 
     */
    @Import(name="deployType")
    private @Nullable Output<Integer> deployType;

    /**
     * @return The deployment type of the instance. **NOTE:** From version 1.161.0, this attribute supports to be updated. Valid values:
     * - 4: eip/vpc instance
     * - 5: vpc instance.
     * 
     */
    public Optional<Output<Integer>> deployType() {
        return Optional.ofNullable(this.deployType);
    }

    /**
     * The disk size of the instance. When modify this value, it only supports adjust to a greater value.
     * 
     */
    @Import(name="diskSize")
    private @Nullable Output<Integer> diskSize;

    /**
     * @return The disk size of the instance. When modify this value, it only supports adjust to a greater value.
     * 
     */
    public Optional<Output<Integer>> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }

    /**
     * The disk type of the instance. 0: efficient cloud disk , 1: SSD.
     * 
     */
    @Import(name="diskType")
    private @Nullable Output<Integer> diskType;

    /**
     * @return The disk type of the instance. 0: efficient cloud disk , 1: SSD.
     * 
     */
    public Optional<Output<Integer>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    /**
     * The max bandwidth of the instance. It will be ignored when `deploy_type = 5`. When modify this value, it only supports adjust to a greater value.
     * 
     */
    @Import(name="eipMax")
    private @Nullable Output<Integer> eipMax;

    /**
     * @return The max bandwidth of the instance. It will be ignored when `deploy_type = 5`. When modify this value, it only supports adjust to a greater value.
     * 
     */
    public Optional<Output<Integer>> eipMax() {
        return Optional.ofNullable(this.eipMax);
    }

    /**
     * The EndPoint to access the kafka instance.
     * 
     */
    @Import(name="endPoint")
    private @Nullable Output<String> endPoint;

    /**
     * @return The EndPoint to access the kafka instance.
     * 
     */
    public Optional<Output<String>> endPoint() {
        return Optional.ofNullable(this.endPoint);
    }

    /**
     * The max value of io of the instance. When modify this value, it only support adjust to a greater value.
     * 
     */
    @Import(name="ioMax")
    private @Nullable Output<Integer> ioMax;

    /**
     * @return The max value of io of the instance. When modify this value, it only support adjust to a greater value.
     * 
     */
    public Optional<Output<Integer>> ioMax() {
        return Optional.ofNullable(this.ioMax);
    }

    /**
     * Name of your Kafka instance. The length should between 3 and 64 characters. If not set, will use instance id as instance name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of your Kafka instance. The length should between 3 and 64 characters. If not set, will use instance id as instance name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The paid type of the instance. Support two type, &#34;PrePaid&#34;: pre paid type instance, &#34;PostPaid&#34;: post paid type instance. Default is PostPaid. When modify this value, it only support adjust from post pay to pre pay.
     * 
     */
    @Import(name="paidType")
    private @Nullable Output<String> paidType;

    /**
     * @return The paid type of the instance. Support two type, &#34;PrePaid&#34;: pre paid type instance, &#34;PostPaid&#34;: post paid type instance. Default is PostPaid. When modify this value, it only support adjust from post pay to pre pay.
     * 
     */
    public Optional<Output<String>> paidType() {
        return Optional.ofNullable(this.paidType);
    }

    /**
     * （Optional, ForceNew, Available in v1.93.0+） The ID of security group for this instance. If the security group is empty, system will create a default one.
     * 
     */
    @Import(name="securityGroup")
    private @Nullable Output<String> securityGroup;

    /**
     * @return （Optional, ForceNew, Available in v1.93.0+） The ID of security group for this instance. If the security group is empty, system will create a default one.
     * 
     */
    public Optional<Output<String>> securityGroup() {
        return Optional.ofNullable(this.securityGroup);
    }

    /**
     * （Optional, Available in v1.112.0+） The kafka openSource version for this instance. Only 0.10.2 or 2.2.0 is allowed, default is 0.10.2.
     * 
     */
    @Import(name="serviceVersion")
    private @Nullable Output<String> serviceVersion;

    /**
     * @return （Optional, Available in v1.112.0+） The kafka openSource version for this instance. Only 0.10.2 or 2.2.0 is allowed, default is 0.10.2.
     * 
     */
    public Optional<Output<String>> serviceVersion() {
        return Optional.ofNullable(this.serviceVersion);
    }

    /**
     * The spec type of the instance. Support two type, &#34;normal&#34;: normal version instance, &#34;professional&#34;: professional version instance. Default is normal. When modify this value, it only support adjust from normal to professional. Note only pre paid type instance support professional specific type.
     * 
     */
    @Import(name="specType")
    private @Nullable Output<String> specType;

    /**
     * @return The spec type of the instance. Support two type, &#34;normal&#34;: normal version instance, &#34;professional&#34;: professional version instance. Default is normal. When modify this value, it only support adjust from normal to professional. Note only pre paid type instance support professional specific type.
     * 
     */
    public Optional<Output<String>> specType() {
        return Optional.ofNullable(this.specType);
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
     * The max num of topic can be creation of the instance. When modify this value, it only adjusts to a greater value.
     * 
     */
    @Import(name="topicQuota")
    private @Nullable Output<Integer> topicQuota;

    /**
     * @return The max num of topic can be creation of the instance. When modify this value, it only adjusts to a greater value.
     * 
     */
    public Optional<Output<Integer>> topicQuota() {
        return Optional.ofNullable(this.topicQuota);
    }

    /**
     * The ID of attaching VPC to instance.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of attaching VPC to instance.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * The ID of attaching vswitch to instance.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The ID of attaching vswitch to instance.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    /**
     * The Zone to launch the kafka instance.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The Zone to launch the kafka instance.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private InstanceState() {}

    private InstanceState(InstanceState $) {
        this.config = $.config;
        this.deployType = $.deployType;
        this.diskSize = $.diskSize;
        this.diskType = $.diskType;
        this.eipMax = $.eipMax;
        this.endPoint = $.endPoint;
        this.ioMax = $.ioMax;
        this.name = $.name;
        this.paidType = $.paidType;
        this.securityGroup = $.securityGroup;
        this.serviceVersion = $.serviceVersion;
        this.specType = $.specType;
        this.tags = $.tags;
        this.topicQuota = $.topicQuota;
        this.vpcId = $.vpcId;
        this.vswitchId = $.vswitchId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceState $;

        public Builder() {
            $ = new InstanceState();
        }

        public Builder(InstanceState defaults) {
            $ = new InstanceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param config （Optional, Available in v1.112.0+） The basic config for this instance. The input should be json type, only the following key allowed: enable.acl, enable.vpc_sasl_ssl, kafka.log.retention.hours, kafka.message.max.bytes.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<String> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config （Optional, Available in v1.112.0+） The basic config for this instance. The input should be json type, only the following key allowed: enable.acl, enable.vpc_sasl_ssl, kafka.log.retention.hours, kafka.message.max.bytes.
         * 
         * @return builder
         * 
         */
        public Builder config(String config) {
            return config(Output.of(config));
        }

        /**
         * @param deployType The deployment type of the instance. **NOTE:** From version 1.161.0, this attribute supports to be updated. Valid values:
         * - 4: eip/vpc instance
         * - 5: vpc instance.
         * 
         * @return builder
         * 
         */
        public Builder deployType(@Nullable Output<Integer> deployType) {
            $.deployType = deployType;
            return this;
        }

        /**
         * @param deployType The deployment type of the instance. **NOTE:** From version 1.161.0, this attribute supports to be updated. Valid values:
         * - 4: eip/vpc instance
         * - 5: vpc instance.
         * 
         * @return builder
         * 
         */
        public Builder deployType(Integer deployType) {
            return deployType(Output.of(deployType));
        }

        /**
         * @param diskSize The disk size of the instance. When modify this value, it only supports adjust to a greater value.
         * 
         * @return builder
         * 
         */
        public Builder diskSize(@Nullable Output<Integer> diskSize) {
            $.diskSize = diskSize;
            return this;
        }

        /**
         * @param diskSize The disk size of the instance. When modify this value, it only supports adjust to a greater value.
         * 
         * @return builder
         * 
         */
        public Builder diskSize(Integer diskSize) {
            return diskSize(Output.of(diskSize));
        }

        /**
         * @param diskType The disk type of the instance. 0: efficient cloud disk , 1: SSD.
         * 
         * @return builder
         * 
         */
        public Builder diskType(@Nullable Output<Integer> diskType) {
            $.diskType = diskType;
            return this;
        }

        /**
         * @param diskType The disk type of the instance. 0: efficient cloud disk , 1: SSD.
         * 
         * @return builder
         * 
         */
        public Builder diskType(Integer diskType) {
            return diskType(Output.of(diskType));
        }

        /**
         * @param eipMax The max bandwidth of the instance. It will be ignored when `deploy_type = 5`. When modify this value, it only supports adjust to a greater value.
         * 
         * @return builder
         * 
         */
        public Builder eipMax(@Nullable Output<Integer> eipMax) {
            $.eipMax = eipMax;
            return this;
        }

        /**
         * @param eipMax The max bandwidth of the instance. It will be ignored when `deploy_type = 5`. When modify this value, it only supports adjust to a greater value.
         * 
         * @return builder
         * 
         */
        public Builder eipMax(Integer eipMax) {
            return eipMax(Output.of(eipMax));
        }

        /**
         * @param endPoint The EndPoint to access the kafka instance.
         * 
         * @return builder
         * 
         */
        public Builder endPoint(@Nullable Output<String> endPoint) {
            $.endPoint = endPoint;
            return this;
        }

        /**
         * @param endPoint The EndPoint to access the kafka instance.
         * 
         * @return builder
         * 
         */
        public Builder endPoint(String endPoint) {
            return endPoint(Output.of(endPoint));
        }

        /**
         * @param ioMax The max value of io of the instance. When modify this value, it only support adjust to a greater value.
         * 
         * @return builder
         * 
         */
        public Builder ioMax(@Nullable Output<Integer> ioMax) {
            $.ioMax = ioMax;
            return this;
        }

        /**
         * @param ioMax The max value of io of the instance. When modify this value, it only support adjust to a greater value.
         * 
         * @return builder
         * 
         */
        public Builder ioMax(Integer ioMax) {
            return ioMax(Output.of(ioMax));
        }

        /**
         * @param name Name of your Kafka instance. The length should between 3 and 64 characters. If not set, will use instance id as instance name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of your Kafka instance. The length should between 3 and 64 characters. If not set, will use instance id as instance name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param paidType The paid type of the instance. Support two type, &#34;PrePaid&#34;: pre paid type instance, &#34;PostPaid&#34;: post paid type instance. Default is PostPaid. When modify this value, it only support adjust from post pay to pre pay.
         * 
         * @return builder
         * 
         */
        public Builder paidType(@Nullable Output<String> paidType) {
            $.paidType = paidType;
            return this;
        }

        /**
         * @param paidType The paid type of the instance. Support two type, &#34;PrePaid&#34;: pre paid type instance, &#34;PostPaid&#34;: post paid type instance. Default is PostPaid. When modify this value, it only support adjust from post pay to pre pay.
         * 
         * @return builder
         * 
         */
        public Builder paidType(String paidType) {
            return paidType(Output.of(paidType));
        }

        /**
         * @param securityGroup （Optional, ForceNew, Available in v1.93.0+） The ID of security group for this instance. If the security group is empty, system will create a default one.
         * 
         * @return builder
         * 
         */
        public Builder securityGroup(@Nullable Output<String> securityGroup) {
            $.securityGroup = securityGroup;
            return this;
        }

        /**
         * @param securityGroup （Optional, ForceNew, Available in v1.93.0+） The ID of security group for this instance. If the security group is empty, system will create a default one.
         * 
         * @return builder
         * 
         */
        public Builder securityGroup(String securityGroup) {
            return securityGroup(Output.of(securityGroup));
        }

        /**
         * @param serviceVersion （Optional, Available in v1.112.0+） The kafka openSource version for this instance. Only 0.10.2 or 2.2.0 is allowed, default is 0.10.2.
         * 
         * @return builder
         * 
         */
        public Builder serviceVersion(@Nullable Output<String> serviceVersion) {
            $.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * @param serviceVersion （Optional, Available in v1.112.0+） The kafka openSource version for this instance. Only 0.10.2 or 2.2.0 is allowed, default is 0.10.2.
         * 
         * @return builder
         * 
         */
        public Builder serviceVersion(String serviceVersion) {
            return serviceVersion(Output.of(serviceVersion));
        }

        /**
         * @param specType The spec type of the instance. Support two type, &#34;normal&#34;: normal version instance, &#34;professional&#34;: professional version instance. Default is normal. When modify this value, it only support adjust from normal to professional. Note only pre paid type instance support professional specific type.
         * 
         * @return builder
         * 
         */
        public Builder specType(@Nullable Output<String> specType) {
            $.specType = specType;
            return this;
        }

        /**
         * @param specType The spec type of the instance. Support two type, &#34;normal&#34;: normal version instance, &#34;professional&#34;: professional version instance. Default is normal. When modify this value, it only support adjust from normal to professional. Note only pre paid type instance support professional specific type.
         * 
         * @return builder
         * 
         */
        public Builder specType(String specType) {
            return specType(Output.of(specType));
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
         * @param topicQuota The max num of topic can be creation of the instance. When modify this value, it only adjusts to a greater value.
         * 
         * @return builder
         * 
         */
        public Builder topicQuota(@Nullable Output<Integer> topicQuota) {
            $.topicQuota = topicQuota;
            return this;
        }

        /**
         * @param topicQuota The max num of topic can be creation of the instance. When modify this value, it only adjusts to a greater value.
         * 
         * @return builder
         * 
         */
        public Builder topicQuota(Integer topicQuota) {
            return topicQuota(Output.of(topicQuota));
        }

        /**
         * @param vpcId The ID of attaching VPC to instance.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of attaching VPC to instance.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vswitchId The ID of attaching vswitch to instance.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The ID of attaching vswitch to instance.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        /**
         * @param zoneId The Zone to launch the kafka instance.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The Zone to launch the kafka instance.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public InstanceState build() {
            return $;
        }
    }

}
