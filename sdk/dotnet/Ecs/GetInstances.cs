// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    public static partial class Invokes
    {
        /// <summary>
        /// The Instances data source list ECS instance resources according to their ID, name regex, image id, status and other fields.
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/instances.html.markdown.
        /// </summary>
        public static Task<GetInstancesResult> GetInstances(GetInstancesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetInstancesResult>("alicloud:ecs/getInstances:getInstances", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetInstancesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Availability zone where instances are located.
        /// </summary>
        [Input("availabilityZone")]
        public string? AvailabilityZone { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of ECS instance IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The image ID of some ECS instance used.
        /// </summary>
        [Input("imageId")]
        public string? ImageId { get; set; }

        /// <summary>
        /// A regex string to filter results by instance name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The RAM role name which the instance attaches.
        /// </summary>
        [Input("ramRoleName")]
        public string? RamRoleName { get; set; }

        /// <summary>
        /// The Id of resource group which the instance belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// Instance status. Valid values: "Creating", "Starting", "Running", "Stopping" and "Stopped". If undefined, all statuses are considered.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// A map of tags assigned to the ECS instances. It must be in the format:
        /// ```
        /// data "alicloud.ecs.getInstances" "taggedInstances" {
        /// tags = {
        /// tagKey1 = "tagValue1",
        /// tagKey2 = "tagValue2"
        /// }
        /// }
        /// ```
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        /// <summary>
        /// ID of the VPC linked to the instances.
        /// </summary>
        [Input("vpcId")]
        public string? VpcId { get; set; }

        /// <summary>
        /// ID of the VSwitch linked to the instances.
        /// </summary>
        [Input("vswitchId")]
        public string? VswitchId { get; set; }

        public GetInstancesArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetInstancesResult
    {
        /// <summary>
        /// Availability zone the instance belongs to.
        /// </summary>
        public readonly string? AvailabilityZone;
        /// <summary>
        /// A list of ECS instance IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// Image ID the instance is using.
        /// </summary>
        public readonly string? ImageId;
        /// <summary>
        /// A list of instances. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstancesInstancesResult> Instances;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of instances names. 
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// The Ram role name.
        /// </summary>
        public readonly string? RamRoleName;
        /// <summary>
        /// The Id of resource group.
        /// </summary>
        public readonly string? ResourceGroupId;
        /// <summary>
        /// Instance current status.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// A map of tags assigned to the ECS instance.
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Tags;
        /// <summary>
        /// ID of the VPC the instance belongs to.
        /// </summary>
        public readonly string? VpcId;
        /// <summary>
        /// ID of the VSwitch the instance belongs to.
        /// </summary>
        public readonly string? VswitchId;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetInstancesResult(
            string? availabilityZone,
            ImmutableArray<string> ids,
            string? imageId,
            ImmutableArray<Outputs.GetInstancesInstancesResult> instances,
            string? nameRegex,
            ImmutableArray<string> names,
            string? outputFile,
            string? ramRoleName,
            string? resourceGroupId,
            string? status,
            ImmutableDictionary<string, object>? tags,
            string? vpcId,
            string? vswitchId,
            string id)
        {
            AvailabilityZone = availabilityZone;
            Ids = ids;
            ImageId = imageId;
            Instances = instances;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            RamRoleName = ramRoleName;
            ResourceGroupId = resourceGroupId;
            Status = status;
            Tags = tags;
            VpcId = vpcId;
            VswitchId = vswitchId;
            Id = id;
        }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetInstancesInstancesDiskDeviceMappingsResult
    {
        /// <summary>
        /// Cloud disk category.
        /// </summary>
        public readonly string Category;
        /// <summary>
        /// Device information of the created disk: such as /dev/xvdb.
        /// </summary>
        public readonly string Device;
        /// <summary>
        /// Size of the created disk.
        /// </summary>
        public readonly int Size;
        /// <summary>
        /// Cloud disk type: system disk or data disk.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetInstancesInstancesDiskDeviceMappingsResult(
            string category,
            string device,
            int size,
            string type)
        {
            Category = category;
            Device = device;
            Size = size;
            Type = type;
        }
    }

    [OutputType]
    public sealed class GetInstancesInstancesResult
    {
        /// <summary>
        /// Availability zone where instances are located.
        /// </summary>
        public readonly string AvailabilityZone;
        /// <summary>
        /// Instance creation time.
        /// </summary>
        public readonly string CreationTime;
        /// <summary>
        /// Instance description.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Description of the attached disks.
        /// </summary>
        public readonly ImmutableArray<GetInstancesInstancesDiskDeviceMappingsResult> DiskDeviceMappings;
        /// <summary>
        /// EIP address the VPC instance is using.
        /// </summary>
        public readonly string Eip;
        /// <summary>
        /// ID of the instance.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The image ID of some ECS instance used.
        /// </summary>
        public readonly string ImageId;
        /// <summary>
        /// Instance charge type.
        /// </summary>
        public readonly string InstanceChargeType;
        /// <summary>
        /// Instance type.
        /// </summary>
        public readonly string InstanceType;
        /// <summary>
        /// Instance network charge type.
        /// </summary>
        public readonly string InternetChargeType;
        /// <summary>
        /// Max output bandwidth for internet.
        /// </summary>
        public readonly int InternetMaxBandwidthOut;
        /// <summary>
        /// Key pair the instance is using.
        /// </summary>
        public readonly string KeyName;
        /// <summary>
        /// Instance name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Instance private IP address.
        /// </summary>
        public readonly string PrivateIp;
        /// <summary>
        /// Instance public IP address.
        /// </summary>
        public readonly string PublicIp;
        /// <summary>
        /// The RAM role name which the instance attaches.
        /// </summary>
        public readonly string RamRoleName;
        /// <summary>
        /// Region ID the instance belongs to.
        /// </summary>
        public readonly string RegionId;
        /// <summary>
        /// The Id of resource group which the instance belongs.
        /// </summary>
        public readonly string ResourceGroupId;
        /// <summary>
        /// List of security group IDs the instance belongs to.
        /// </summary>
        public readonly ImmutableArray<string> SecurityGroups;
        /// <summary>
        /// Spot strategy the instance is using.
        /// </summary>
        public readonly string SpotStrategy;
        /// <summary>
        /// Instance status. Valid values: "Creating", "Starting", "Running", "Stopping" and "Stopped". If undefined, all statuses are considered.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// A map of tags assigned to the ECS instances. It must be in the format:
        /// ```
        /// data "alicloud.ecs.getInstances" "taggedInstances" {
        /// tags = {
        /// tagKey1 = "tagValue1",
        /// tagKey2 = "tagValue2"
        /// }
        /// }
        /// ```
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Tags;
        /// <summary>
        /// ID of the VPC linked to the instances.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// ID of the VSwitch linked to the instances.
        /// </summary>
        public readonly string VswitchId;

        [OutputConstructor]
        private GetInstancesInstancesResult(
            string availabilityZone,
            string creationTime,
            string description,
            ImmutableArray<GetInstancesInstancesDiskDeviceMappingsResult> diskDeviceMappings,
            string eip,
            string id,
            string imageId,
            string instanceChargeType,
            string instanceType,
            string internetChargeType,
            int internetMaxBandwidthOut,
            string keyName,
            string name,
            string privateIp,
            string publicIp,
            string ramRoleName,
            string regionId,
            string resourceGroupId,
            ImmutableArray<string> securityGroups,
            string spotStrategy,
            string status,
            ImmutableDictionary<string, object>? tags,
            string vpcId,
            string vswitchId)
        {
            AvailabilityZone = availabilityZone;
            CreationTime = creationTime;
            Description = description;
            DiskDeviceMappings = diskDeviceMappings;
            Eip = eip;
            Id = id;
            ImageId = imageId;
            InstanceChargeType = instanceChargeType;
            InstanceType = instanceType;
            InternetChargeType = internetChargeType;
            InternetMaxBandwidthOut = internetMaxBandwidthOut;
            KeyName = keyName;
            Name = name;
            PrivateIp = privateIp;
            PublicIp = publicIp;
            RamRoleName = ramRoleName;
            RegionId = regionId;
            ResourceGroupId = resourceGroupId;
            SecurityGroups = securityGroups;
            SpotStrategy = spotStrategy;
            Status = status;
            Tags = tags;
            VpcId = vpcId;
            VswitchId = vswitchId;
        }
    }
    }
}