// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    public static class GetNetworkInterfaces
    {
        /// <summary>
        /// Use this data source to get a list of elastic network interfaces according to the specified filters in an Alibaba Cloud account.
        /// 
        /// For information about elastic network interface and how to use it, see [Elastic Network Interface](https://www.alibabacloud.com/help/doc-detail/58496.html)
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///         var name = config.Get("name") ?? "networkInterfacesName";
        ///         var vpc = new AliCloud.Vpc.Network("vpc", new AliCloud.Vpc.NetworkArgs
        ///         {
        ///             CidrBlock = "192.168.0.0/24",
        ///         });
        ///         var defaultZones = Output.Create(AliCloud.GetZones.InvokeAsync(new AliCloud.GetZonesArgs
        ///         {
        ///             AvailableResourceCreation = "VSwitch",
        ///         }));
        ///         var vswitch = new AliCloud.Vpc.Switch("vswitch", new AliCloud.Vpc.SwitchArgs
        ///         {
        ///             AvailabilityZone = defaultZones.Apply(defaultZones =&gt; defaultZones.Zones[0].Id),
        ///             CidrBlock = "192.168.0.0/24",
        ///             VpcId = vpc.Id,
        ///         });
        ///         var @group = new AliCloud.Ecs.SecurityGroup("group", new AliCloud.Ecs.SecurityGroupArgs
        ///         {
        ///             VpcId = vpc.Id,
        ///         });
        ///         var @interface = new AliCloud.Vpc.NetworkInterface("interface", new AliCloud.Vpc.NetworkInterfaceArgs
        ///         {
        ///             Description = "Basic test",
        ///             PrivateIp = "192.168.0.2",
        ///             SecurityGroups = 
        ///             {
        ///                 @group.Id,
        ///             },
        ///             Tags = 
        ///             {
        ///                 { "TF-VER", "0.11.3" },
        ///             },
        ///             VswitchId = vswitch.Id,
        ///         });
        ///         var instance = new AliCloud.Ecs.Instance("instance", new AliCloud.Ecs.InstanceArgs
        ///         {
        ///             AvailabilityZone = defaultZones.Apply(defaultZones =&gt; defaultZones.Zones[0].Id),
        ///             ImageId = "centos_7_04_64_20G_alibase_201701015.vhd",
        ///             InstanceName = name,
        ///             InstanceType = "ecs.e3.xlarge",
        ///             InternetMaxBandwidthOut = 10,
        ///             SecurityGroups = 
        ///             {
        ///                 @group.Id,
        ///             },
        ///             SystemDiskCategory = "cloud_efficiency",
        ///             VswitchId = vswitch.Id,
        ///         });
        ///         var attachment = new AliCloud.Vpc.NetworkInterfaceAttachment("attachment", new AliCloud.Vpc.NetworkInterfaceAttachmentArgs
        ///         {
        ///             InstanceId = instance.Id,
        ///             NetworkInterfaceId = @interface.Id,
        ///         });
        ///         var defaultNetworkInterfaces = Output.Tuple(attachment.NetworkInterfaceId, instance.Id, @group.Id, vpc.Id, vswitch.Id).Apply(values =&gt;
        ///         {
        ///             var networkInterfaceId = values.Item1;
        ///             var instanceId = values.Item2;
        ///             var groupId = values.Item3;
        ///             var vpcId = values.Item4;
        ///             var vswitchId = values.Item5;
        ///             return AliCloud.Ecs.GetNetworkInterfaces.InvokeAsync(new AliCloud.Ecs.GetNetworkInterfacesArgs
        ///             {
        ///                 Ids = 
        ///                 {
        ///                     networkInterfaceId,
        ///                 },
        ///                 InstanceId = instanceId,
        ///                 NameRegex = name,
        ///                 PrivateIp = "192.168.0.2",
        ///                 SecurityGroupId = groupId,
        ///                 Tags = 
        ///                 {
        ///                     { "TF-VER", "0.11.3" },
        ///                 },
        ///                 Type = "Secondary",
        ///                 VpcId = vpcId,
        ///                 VswitchId = vswitchId,
        ///             });
        ///         });
        ///         this.Eni0Name = defaultNetworkInterfaces.Apply(defaultNetworkInterfaces =&gt; defaultNetworkInterfaces.Interfaces[0].Name);
        ///     }
        /// 
        ///     [Output("eni0Name")]
        ///     public Output&lt;string&gt; Eni0Name { get; set; }
        /// }
        /// ```
        /// 
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ##  Argument Reference
        /// 
        /// The following arguments are supported:
        /// 
        /// * `ids` - (Optional)  A list of ENI IDs.
        /// * `name_regex` - (Optional) A regex string to filter results by ENI name.
        /// * `vpc_id` - (Optional) The VPC ID linked to ENIs.
        /// * `vswitch_id` - (Optional) The VSwitch ID linked to ENIs.
        /// * `private_ip` - (Optional) The primary private IP address of the ENI.
        /// * `security_group_id` - (Optional) The security group ID linked to ENIs.
        /// * `name` - (Optional) The name of the ENIs.
        /// * `type` - (Optional) The type of ENIs, Only support for "Primary" or "Secondary".
        /// * `instance_id` - (Optional) The ECS instance ID that the ENI is attached to.
        /// * `tags` - (Optional) A map of tags assigned to ENIs.
        /// * `output_file` - (Optional) The name of output file that saves the filter results.
        /// * `resource_group_id` - (Optional, ForceNew, Available in 1.57.0+) The Id of resource group which the network interface belongs.
        /// </summary>
        public static Task<GetNetworkInterfacesResult> InvokeAsync(GetNetworkInterfacesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetNetworkInterfacesResult>("alicloud:ecs/getNetworkInterfaces:getNetworkInterfaces", args ?? new GetNetworkInterfacesArgs(), options.WithVersion());
    }


    public sealed class GetNetworkInterfacesArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// ID of the instance that the ENI is attached to.
        /// </summary>
        [Input("instanceId")]
        public string? InstanceId { get; set; }

        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Primary private IP of the ENI.
        /// </summary>
        [Input("privateIp")]
        public string? PrivateIp { get; set; }

        /// <summary>
        /// The Id of resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        [Input("securityGroupId")]
        public string? SecurityGroupId { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// A map of tags assigned to the ENI.
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        [Input("type")]
        public string? Type { get; set; }

        /// <summary>
        /// ID of the VPC that the ENI belongs to.
        /// </summary>
        [Input("vpcId")]
        public string? VpcId { get; set; }

        /// <summary>
        /// ID of the VSwitch that the ENI is linked to.
        /// </summary>
        [Input("vswitchId")]
        public string? VswitchId { get; set; }

        public GetNetworkInterfacesArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetNetworkInterfacesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// ID of the instance that the ENI is attached to.
        /// </summary>
        public readonly string? InstanceId;
        /// <summary>
        /// A list of ENIs. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkInterfacesInterfaceResult> Interfaces;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// Primary private IP of the ENI.
        /// </summary>
        public readonly string? PrivateIp;
        /// <summary>
        /// The Id of resource group.
        /// </summary>
        public readonly string? ResourceGroupId;
        public readonly string? SecurityGroupId;
        /// <summary>
        /// A map of tags assigned to the ENI.
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Tags;
        public readonly string? Type;
        /// <summary>
        /// ID of the VPC that the ENI belongs to.
        /// </summary>
        public readonly string? VpcId;
        /// <summary>
        /// ID of the VSwitch that the ENI is linked to.
        /// </summary>
        public readonly string? VswitchId;

        [OutputConstructor]
        private GetNetworkInterfacesResult(
            string id,

            ImmutableArray<string> ids,

            string? instanceId,

            ImmutableArray<Outputs.GetNetworkInterfacesInterfaceResult> interfaces,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? privateIp,

            string? resourceGroupId,

            string? securityGroupId,

            ImmutableDictionary<string, object>? tags,

            string? type,

            string? vpcId,

            string? vswitchId)
        {
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            Interfaces = interfaces;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            PrivateIp = privateIp;
            ResourceGroupId = resourceGroupId;
            SecurityGroupId = securityGroupId;
            Tags = tags;
            Type = type;
            VpcId = vpcId;
            VswitchId = vswitchId;
        }
    }
}
