// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb
{
    /// <summary>
    /// Provides an Application Load Balancer resource.
    /// 
    /// &gt; **NOTE:** At present, to avoid some unnecessary regulation confusion, SLB can not support alicloud international account to create "paybybandwidth" instance.
    /// 
    /// &gt; **NOTE:** The supported specifications vary by region. Currently not all regions support guaranteed-performance instances.
    /// For more details about guaranteed-performance instance, see [Guaranteed-performance instances](https://www.alibabacloud.com/help/doc-detail/27657.htm).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var config = new Config();
    ///         var name = config.Get("name") ?? "terraformtestslbconfig";
    ///         var defaultZones = Output.Create(AliCloud.GetZones.InvokeAsync(new AliCloud.GetZonesArgs
    ///         {
    ///             AvailableResourceCreation = "VSwitch",
    ///         }));
    ///         var defaultNetwork = new AliCloud.Vpc.Network("defaultNetwork", new AliCloud.Vpc.NetworkArgs
    ///         {
    ///             CidrBlock = "172.16.0.0/12",
    ///         });
    ///         var defaultSwitch = new AliCloud.Vpc.Switch("defaultSwitch", new AliCloud.Vpc.SwitchArgs
    ///         {
    ///             AvailabilityZone = defaultZones.Apply(defaultZones =&gt; defaultZones.Zones[0].Id),
    ///             CidrBlock = "172.16.0.0/21",
    ///             VpcId = defaultNetwork.Id,
    ///         });
    ///         var defaultLoadBalancer = new AliCloud.Slb.LoadBalancer("defaultLoadBalancer", new AliCloud.Slb.LoadBalancerArgs
    ///         {
    ///             Specification = "slb.s2.small",
    ///             Tags = 
    ///             {
    ///                 { "tag_a", 1 },
    ///                 { "tag_b", 2 },
    ///                 { "tag_c", 3 },
    ///                 { "tag_d", 4 },
    ///                 { "tag_e", 5 },
    ///                 { "tag_f", 6 },
    ///                 { "tag_g", 7 },
    ///                 { "tag_h", 8 },
    ///                 { "tag_i", 9 },
    ///                 { "tag_j", 10 },
    ///             },
    ///             VswitchId = defaultSwitch.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class LoadBalancer : Pulumi.CustomResource
    {
        /// <summary>
        /// Specify the IP address of the private network for the SLB instance, which must be in the destination CIDR block of the correspond ing switch.
        /// </summary>
        [Output("address")]
        public Output<string> Address { get; private set; } = null!;

        /// <summary>
        /// The IP version of the SLB instance to be created, which can be set to ipv4 or ipv6 . Default to "ipv4". Now, only internet instance support ipv6 address.
        /// </summary>
        [Output("addressIpVersion")]
        public Output<string?> AddressIpVersion { get; private set; } = null!;

        /// <summary>
        /// The network type of the SLB instance. Valid values: ["internet", "intranet"]. If load balancer launched in VPC, this value must be "intranet".
        /// - internet: After an Internet SLB instance is created, the system allocates a public IP address so that the instance can forward requests from the Internet.
        /// - intranet: After an intranet SLB instance is created, the system allocates an intranet IP address so that the instance can only forward intranet requests.
        /// </summary>
        [Output("addressType")]
        public Output<string> AddressType { get; private set; } = null!;

        /// <summary>
        /// Valid
        /// value is between 1 and 1000, If argument "internet_charge_type" is "paybytraffic", then this value will be ignore.
        /// </summary>
        [Output("bandwidth")]
        public Output<int?> Bandwidth { get; private set; } = null!;

        /// <summary>
        /// Whether enable the deletion protection or not. on: Enable deletion protection. off: Disable deletion protection. Default to off. Only postpaid instance support this function.
        /// </summary>
        [Output("deleteProtection")]
        public Output<string?> DeleteProtection { get; private set; } = null!;

        /// <summary>
        /// The billing method of the load balancer. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
        /// </summary>
        [Output("instanceChargeType")]
        public Output<string?> InstanceChargeType { get; private set; } = null!;

        /// <summary>
        /// Field 'internet' has been deprecated from provider version 1.55.3. Use 'address_type' replaces it.
        /// </summary>
        [Output("internet")]
        public Output<bool> Internet { get; private set; } = null!;

        /// <summary>
        /// Valid
        /// values are `PayByBandwidth`, `PayByTraffic`. If this value is "PayByBandwidth", then argument "internet" must be "true". Default is "PayByTraffic". If load balancer launched in VPC, this value must be "PayByTraffic".
        /// Before version 1.10.1, the valid values are "paybybandwidth" and "paybytraffic".
        /// </summary>
        [Output("internetChargeType")]
        public Output<string?> InternetChargeType { get; private set; } = null!;

        /// <summary>
        /// The primary zone ID of the SLB instance. If not specified, the system will be randomly assigned. You can query the primary and standby zones in a region by calling the DescribeZone API.
        /// </summary>
        [Output("masterZoneId")]
        public Output<string> MasterZoneId { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid values: [1-9, 12, 24, 36].
        /// </summary>
        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// The Id of resource group which the SLB belongs.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The standby zone ID of the SLB instance. If not specified, the system will be randomly assigned. You can query the primary and standby zones in a region by calling the DescribeZone API.
        /// </summary>
        [Output("slaveZoneId")]
        public Output<string> SlaveZoneId { get; private set; } = null!;

        /// <summary>
        /// The specification of the Server Load Balancer instance. Default to empty string indicating it is "Shared-Performance" instance.
        /// Launching "[Performance-guaranteed](https://www.alibabacloud.com/help/doc-detail/27657.htm)" instance, it is must be specified and it valid values are: "slb.s1.small", "slb.s2.small", "slb.s2.medium",
        /// "slb.s3.small", "slb.s3.medium", "slb.s3.large" and "slb.s4.large".
        /// </summary>
        [Output("specification")]
        public Output<string?> Specification { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource. The `tags` can have a maximum of 10 tag for every load balancer instance.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The VSwitch ID to launch in. If `address_type` is internet, it will be ignore.
        /// </summary>
        [Output("vswitchId")]
        public Output<string?> VswitchId { get; private set; } = null!;


        /// <summary>
        /// Create a LoadBalancer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LoadBalancer(string name, LoadBalancerArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:slb/loadBalancer:LoadBalancer", name, args ?? new LoadBalancerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LoadBalancer(string name, Input<string> id, LoadBalancerState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:slb/loadBalancer:LoadBalancer", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LoadBalancer Get(string name, Input<string> id, LoadBalancerState? state = null, CustomResourceOptions? options = null)
        {
            return new LoadBalancer(name, id, state, options);
        }
    }

    public sealed class LoadBalancerArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specify the IP address of the private network for the SLB instance, which must be in the destination CIDR block of the correspond ing switch.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The IP version of the SLB instance to be created, which can be set to ipv4 or ipv6 . Default to "ipv4". Now, only internet instance support ipv6 address.
        /// </summary>
        [Input("addressIpVersion")]
        public Input<string>? AddressIpVersion { get; set; }

        /// <summary>
        /// The network type of the SLB instance. Valid values: ["internet", "intranet"]. If load balancer launched in VPC, this value must be "intranet".
        /// - internet: After an Internet SLB instance is created, the system allocates a public IP address so that the instance can forward requests from the Internet.
        /// - intranet: After an intranet SLB instance is created, the system allocates an intranet IP address so that the instance can only forward intranet requests.
        /// </summary>
        [Input("addressType")]
        public Input<string>? AddressType { get; set; }

        /// <summary>
        /// Valid
        /// value is between 1 and 1000, If argument "internet_charge_type" is "paybytraffic", then this value will be ignore.
        /// </summary>
        [Input("bandwidth")]
        public Input<int>? Bandwidth { get; set; }

        /// <summary>
        /// Whether enable the deletion protection or not. on: Enable deletion protection. off: Disable deletion protection. Default to off. Only postpaid instance support this function.
        /// </summary>
        [Input("deleteProtection")]
        public Input<string>? DeleteProtection { get; set; }

        /// <summary>
        /// The billing method of the load balancer. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
        /// </summary>
        [Input("instanceChargeType")]
        public Input<string>? InstanceChargeType { get; set; }

        /// <summary>
        /// Field 'internet' has been deprecated from provider version 1.55.3. Use 'address_type' replaces it.
        /// </summary>
        [Input("internet")]
        public Input<bool>? Internet { get; set; }

        /// <summary>
        /// Valid
        /// values are `PayByBandwidth`, `PayByTraffic`. If this value is "PayByBandwidth", then argument "internet" must be "true". Default is "PayByTraffic". If load balancer launched in VPC, this value must be "PayByTraffic".
        /// Before version 1.10.1, the valid values are "paybybandwidth" and "paybytraffic".
        /// </summary>
        [Input("internetChargeType")]
        public Input<string>? InternetChargeType { get; set; }

        /// <summary>
        /// The primary zone ID of the SLB instance. If not specified, the system will be randomly assigned. You can query the primary and standby zones in a region by calling the DescribeZone API.
        /// </summary>
        [Input("masterZoneId")]
        public Input<string>? MasterZoneId { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid values: [1-9, 12, 24, 36].
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The Id of resource group which the SLB belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The standby zone ID of the SLB instance. If not specified, the system will be randomly assigned. You can query the primary and standby zones in a region by calling the DescribeZone API.
        /// </summary>
        [Input("slaveZoneId")]
        public Input<string>? SlaveZoneId { get; set; }

        /// <summary>
        /// The specification of the Server Load Balancer instance. Default to empty string indicating it is "Shared-Performance" instance.
        /// Launching "[Performance-guaranteed](https://www.alibabacloud.com/help/doc-detail/27657.htm)" instance, it is must be specified and it valid values are: "slb.s1.small", "slb.s2.small", "slb.s2.medium",
        /// "slb.s3.small", "slb.s3.medium", "slb.s3.large" and "slb.s4.large".
        /// </summary>
        [Input("specification")]
        public Input<string>? Specification { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource. The `tags` can have a maximum of 10 tag for every load balancer instance.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The VSwitch ID to launch in. If `address_type` is internet, it will be ignore.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public LoadBalancerArgs()
        {
        }
    }

    public sealed class LoadBalancerState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specify the IP address of the private network for the SLB instance, which must be in the destination CIDR block of the correspond ing switch.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The IP version of the SLB instance to be created, which can be set to ipv4 or ipv6 . Default to "ipv4". Now, only internet instance support ipv6 address.
        /// </summary>
        [Input("addressIpVersion")]
        public Input<string>? AddressIpVersion { get; set; }

        /// <summary>
        /// The network type of the SLB instance. Valid values: ["internet", "intranet"]. If load balancer launched in VPC, this value must be "intranet".
        /// - internet: After an Internet SLB instance is created, the system allocates a public IP address so that the instance can forward requests from the Internet.
        /// - intranet: After an intranet SLB instance is created, the system allocates an intranet IP address so that the instance can only forward intranet requests.
        /// </summary>
        [Input("addressType")]
        public Input<string>? AddressType { get; set; }

        /// <summary>
        /// Valid
        /// value is between 1 and 1000, If argument "internet_charge_type" is "paybytraffic", then this value will be ignore.
        /// </summary>
        [Input("bandwidth")]
        public Input<int>? Bandwidth { get; set; }

        /// <summary>
        /// Whether enable the deletion protection or not. on: Enable deletion protection. off: Disable deletion protection. Default to off. Only postpaid instance support this function.
        /// </summary>
        [Input("deleteProtection")]
        public Input<string>? DeleteProtection { get; set; }

        /// <summary>
        /// The billing method of the load balancer. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
        /// </summary>
        [Input("instanceChargeType")]
        public Input<string>? InstanceChargeType { get; set; }

        /// <summary>
        /// Field 'internet' has been deprecated from provider version 1.55.3. Use 'address_type' replaces it.
        /// </summary>
        [Input("internet")]
        public Input<bool>? Internet { get; set; }

        /// <summary>
        /// Valid
        /// values are `PayByBandwidth`, `PayByTraffic`. If this value is "PayByBandwidth", then argument "internet" must be "true". Default is "PayByTraffic". If load balancer launched in VPC, this value must be "PayByTraffic".
        /// Before version 1.10.1, the valid values are "paybybandwidth" and "paybytraffic".
        /// </summary>
        [Input("internetChargeType")]
        public Input<string>? InternetChargeType { get; set; }

        /// <summary>
        /// The primary zone ID of the SLB instance. If not specified, the system will be randomly assigned. You can query the primary and standby zones in a region by calling the DescribeZone API.
        /// </summary>
        [Input("masterZoneId")]
        public Input<string>? MasterZoneId { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid values: [1-9, 12, 24, 36].
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The Id of resource group which the SLB belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The standby zone ID of the SLB instance. If not specified, the system will be randomly assigned. You can query the primary and standby zones in a region by calling the DescribeZone API.
        /// </summary>
        [Input("slaveZoneId")]
        public Input<string>? SlaveZoneId { get; set; }

        /// <summary>
        /// The specification of the Server Load Balancer instance. Default to empty string indicating it is "Shared-Performance" instance.
        /// Launching "[Performance-guaranteed](https://www.alibabacloud.com/help/doc-detail/27657.htm)" instance, it is must be specified and it valid values are: "slb.s1.small", "slb.s2.small", "slb.s2.medium",
        /// "slb.s3.small", "slb.s3.medium", "slb.s3.large" and "slb.s4.large".
        /// </summary>
        [Input("specification")]
        public Input<string>? Specification { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource. The `tags` can have a maximum of 10 tag for every load balancer instance.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The VSwitch ID to launch in. If `address_type` is internet, it will be ignore.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public LoadBalancerState()
        {
        }
    }
}
