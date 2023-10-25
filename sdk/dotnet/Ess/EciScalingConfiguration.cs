// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess
{
    /// <summary>
    /// Provides a ESS eci scaling configuration resource.
    /// 
    /// For information about ess eci scaling configuration, see [CreateEciScalingConfiguration](https://www.alibabacloud.com/help/en/auto-scaling/latest/create-eci-scaling-configuration).
    /// 
    /// &gt; **NOTE:** Available since v1.164.0.
    /// 
    /// ## Import
    /// 
    /// ESS eci scaling configuration can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ess/eciScalingConfiguration:EciScalingConfiguration example asc-abc123456
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ess/eciScalingConfiguration:EciScalingConfiguration")]
    public partial class EciScalingConfiguration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Information about the Container Registry Enterprise Edition instance. See `acr_registry_infos` below for details.
        /// </summary>
        [Output("acrRegistryInfos")]
        public Output<ImmutableArray<Outputs.EciScalingConfigurationAcrRegistryInfo>> AcrRegistryInfos { get; private set; } = null!;

        /// <summary>
        /// Whether active current eci scaling configuration in the specified scaling group. Note that only
        /// one configuration can be active. Default to `false`.
        /// </summary>
        [Output("active")]
        public Output<bool?> Active { get; private set; } = null!;

        /// <summary>
        /// Whether create eip automatically.
        /// </summary>
        [Output("autoCreateEip")]
        public Output<bool?> AutoCreateEip { get; private set; } = null!;

        /// <summary>
        /// The name of the container group.
        /// </summary>
        [Output("containerGroupName")]
        public Output<string?> ContainerGroupName { get; private set; } = null!;

        /// <summary>
        /// The list of containers. See `containers` below for details.
        /// </summary>
        [Output("containers")]
        public Output<ImmutableArray<Outputs.EciScalingConfigurationContainer>> Containers { get; private set; } = null!;

        /// <summary>
        /// The amount of CPU resources allocated to the container group.
        /// </summary>
        [Output("cpu")]
        public Output<double?> Cpu { get; private set; } = null!;

        /// <summary>
        /// The description of data disk N. Valid values of N: 1 to 16. The description must be 2 to
        /// 256 characters in length and cannot start with http:// or https://.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// dns policy of contain group.
        /// </summary>
        [Output("dnsPolicy")]
        public Output<string?> DnsPolicy { get; private set; } = null!;

        /// <summary>
        /// egress bandwidth.
        /// </summary>
        [Output("egressBandwidth")]
        public Output<int?> EgressBandwidth { get; private set; } = null!;

        /// <summary>
        /// Eip bandwidth.
        /// </summary>
        [Output("eipBandwidth")]
        public Output<int?> EipBandwidth { get; private set; } = null!;

        /// <summary>
        /// Enable sls log service.
        /// </summary>
        [Output("enableSls")]
        public Output<bool?> EnableSls { get; private set; } = null!;

        /// <summary>
        /// The eci scaling configuration will be deleted forcibly with deleting its scaling group.
        /// Default to false.
        /// </summary>
        [Output("forceDelete")]
        public Output<bool?> ForceDelete { get; private set; } = null!;

        /// <summary>
        /// HostAliases. See `host_aliases` below.
        /// </summary>
        [Output("hostAliases")]
        public Output<ImmutableArray<Outputs.EciScalingConfigurationHostAlias>> HostAliases { get; private set; } = null!;

        /// <summary>
        /// Hostname of an ECI instance.
        /// </summary>
        [Output("hostName")]
        public Output<string?> HostName { get; private set; } = null!;

        /// <summary>
        /// The image registry credential.   See `image_registry_credentials` below for
        /// details.
        /// </summary>
        [Output("imageRegistryCredentials")]
        public Output<ImmutableArray<Outputs.EciScalingConfigurationImageRegistryCredential>> ImageRegistryCredentials { get; private set; } = null!;

        /// <summary>
        /// Ingress bandwidth.
        /// </summary>
        [Output("ingressBandwidth")]
        public Output<int?> IngressBandwidth { get; private set; } = null!;

        /// <summary>
        /// The list of initContainers. See `init_containers` below for details.
        /// </summary>
        [Output("initContainers")]
        public Output<ImmutableArray<Outputs.EciScalingConfigurationInitContainer>> InitContainers { get; private set; } = null!;

        /// <summary>
        /// The amount of memory resources allocated to the container group.
        /// </summary>
        [Output("memory")]
        public Output<double?> Memory { get; private set; } = null!;

        /// <summary>
        /// The RAM role that the container group assumes. ECI and ECS share the same RAM role.
        /// </summary>
        [Output("ramRoleName")]
        public Output<string?> RamRoleName { get; private set; } = null!;

        /// <summary>
        /// ID of resource group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string?> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The restart policy of the container group. Default to `Always`.
        /// </summary>
        [Output("restartPolicy")]
        public Output<string?> RestartPolicy { get; private set; } = null!;

        /// <summary>
        /// Name shown for the scheduled task. which must contain 2-64 characters (
        /// English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number,
        /// underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is
        /// EciScalingConfigurationId.
        /// </summary>
        [Output("scalingConfigurationName")]
        public Output<string> ScalingConfigurationName { get; private set; } = null!;

        /// <summary>
        /// ID of the scaling group of a eci scaling configuration.
        /// </summary>
        [Output("scalingGroupId")]
        public Output<string> ScalingGroupId { get; private set; } = null!;

        /// <summary>
        /// ID of the security group used to create new instance. It is conflict
        /// with `security_group_ids`.
        /// </summary>
        [Output("securityGroupId")]
        public Output<string?> SecurityGroupId { get; private set; } = null!;

        /// <summary>
        /// The maximum price hourly for spot instance.
        /// </summary>
        [Output("spotPriceLimit")]
        public Output<double?> SpotPriceLimit { get; private set; } = null!;

        /// <summary>
        /// The spot strategy for a Pay-As-You-Go instance. Valid values: `NoSpot`, `SpotAsPriceGo`
        /// , `SpotWithPriceLimit`.
        /// </summary>
        [Output("spotStrategy")]
        public Output<string?> SpotStrategy { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource. It will be applied for ECI instances finally.
        /// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot
        /// be a null string.
        /// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be
        /// a null string.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The list of volumes. See `volumes` below for details.
        /// </summary>
        [Output("volumes")]
        public Output<ImmutableArray<Outputs.EciScalingConfigurationVolume>> Volumes { get; private set; } = null!;


        /// <summary>
        /// Create a EciScalingConfiguration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EciScalingConfiguration(string name, EciScalingConfigurationArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ess/eciScalingConfiguration:EciScalingConfiguration", name, args ?? new EciScalingConfigurationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EciScalingConfiguration(string name, Input<string> id, EciScalingConfigurationState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ess/eciScalingConfiguration:EciScalingConfiguration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EciScalingConfiguration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EciScalingConfiguration Get(string name, Input<string> id, EciScalingConfigurationState? state = null, CustomResourceOptions? options = null)
        {
            return new EciScalingConfiguration(name, id, state, options);
        }
    }

    public sealed class EciScalingConfigurationArgs : global::Pulumi.ResourceArgs
    {
        [Input("acrRegistryInfos")]
        private InputList<Inputs.EciScalingConfigurationAcrRegistryInfoArgs>? _acrRegistryInfos;

        /// <summary>
        /// Information about the Container Registry Enterprise Edition instance. See `acr_registry_infos` below for details.
        /// </summary>
        public InputList<Inputs.EciScalingConfigurationAcrRegistryInfoArgs> AcrRegistryInfos
        {
            get => _acrRegistryInfos ?? (_acrRegistryInfos = new InputList<Inputs.EciScalingConfigurationAcrRegistryInfoArgs>());
            set => _acrRegistryInfos = value;
        }

        /// <summary>
        /// Whether active current eci scaling configuration in the specified scaling group. Note that only
        /// one configuration can be active. Default to `false`.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// Whether create eip automatically.
        /// </summary>
        [Input("autoCreateEip")]
        public Input<bool>? AutoCreateEip { get; set; }

        /// <summary>
        /// The name of the container group.
        /// </summary>
        [Input("containerGroupName")]
        public Input<string>? ContainerGroupName { get; set; }

        [Input("containers")]
        private InputList<Inputs.EciScalingConfigurationContainerArgs>? _containers;

        /// <summary>
        /// The list of containers. See `containers` below for details.
        /// </summary>
        public InputList<Inputs.EciScalingConfigurationContainerArgs> Containers
        {
            get => _containers ?? (_containers = new InputList<Inputs.EciScalingConfigurationContainerArgs>());
            set => _containers = value;
        }

        /// <summary>
        /// The amount of CPU resources allocated to the container group.
        /// </summary>
        [Input("cpu")]
        public Input<double>? Cpu { get; set; }

        /// <summary>
        /// The description of data disk N. Valid values of N: 1 to 16. The description must be 2 to
        /// 256 characters in length and cannot start with http:// or https://.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// dns policy of contain group.
        /// </summary>
        [Input("dnsPolicy")]
        public Input<string>? DnsPolicy { get; set; }

        /// <summary>
        /// egress bandwidth.
        /// </summary>
        [Input("egressBandwidth")]
        public Input<int>? EgressBandwidth { get; set; }

        /// <summary>
        /// Eip bandwidth.
        /// </summary>
        [Input("eipBandwidth")]
        public Input<int>? EipBandwidth { get; set; }

        /// <summary>
        /// Enable sls log service.
        /// </summary>
        [Input("enableSls")]
        public Input<bool>? EnableSls { get; set; }

        /// <summary>
        /// The eci scaling configuration will be deleted forcibly with deleting its scaling group.
        /// Default to false.
        /// </summary>
        [Input("forceDelete")]
        public Input<bool>? ForceDelete { get; set; }

        [Input("hostAliases")]
        private InputList<Inputs.EciScalingConfigurationHostAliasArgs>? _hostAliases;

        /// <summary>
        /// HostAliases. See `host_aliases` below.
        /// </summary>
        public InputList<Inputs.EciScalingConfigurationHostAliasArgs> HostAliases
        {
            get => _hostAliases ?? (_hostAliases = new InputList<Inputs.EciScalingConfigurationHostAliasArgs>());
            set => _hostAliases = value;
        }

        /// <summary>
        /// Hostname of an ECI instance.
        /// </summary>
        [Input("hostName")]
        public Input<string>? HostName { get; set; }

        [Input("imageRegistryCredentials")]
        private InputList<Inputs.EciScalingConfigurationImageRegistryCredentialArgs>? _imageRegistryCredentials;

        /// <summary>
        /// The image registry credential.   See `image_registry_credentials` below for
        /// details.
        /// </summary>
        public InputList<Inputs.EciScalingConfigurationImageRegistryCredentialArgs> ImageRegistryCredentials
        {
            get => _imageRegistryCredentials ?? (_imageRegistryCredentials = new InputList<Inputs.EciScalingConfigurationImageRegistryCredentialArgs>());
            set => _imageRegistryCredentials = value;
        }

        /// <summary>
        /// Ingress bandwidth.
        /// </summary>
        [Input("ingressBandwidth")]
        public Input<int>? IngressBandwidth { get; set; }

        [Input("initContainers")]
        private InputList<Inputs.EciScalingConfigurationInitContainerArgs>? _initContainers;

        /// <summary>
        /// The list of initContainers. See `init_containers` below for details.
        /// </summary>
        public InputList<Inputs.EciScalingConfigurationInitContainerArgs> InitContainers
        {
            get => _initContainers ?? (_initContainers = new InputList<Inputs.EciScalingConfigurationInitContainerArgs>());
            set => _initContainers = value;
        }

        /// <summary>
        /// The amount of memory resources allocated to the container group.
        /// </summary>
        [Input("memory")]
        public Input<double>? Memory { get; set; }

        /// <summary>
        /// The RAM role that the container group assumes. ECI and ECS share the same RAM role.
        /// </summary>
        [Input("ramRoleName")]
        public Input<string>? RamRoleName { get; set; }

        /// <summary>
        /// ID of resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The restart policy of the container group. Default to `Always`.
        /// </summary>
        [Input("restartPolicy")]
        public Input<string>? RestartPolicy { get; set; }

        /// <summary>
        /// Name shown for the scheduled task. which must contain 2-64 characters (
        /// English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number,
        /// underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is
        /// EciScalingConfigurationId.
        /// </summary>
        [Input("scalingConfigurationName")]
        public Input<string>? ScalingConfigurationName { get; set; }

        /// <summary>
        /// ID of the scaling group of a eci scaling configuration.
        /// </summary>
        [Input("scalingGroupId", required: true)]
        public Input<string> ScalingGroupId { get; set; } = null!;

        /// <summary>
        /// ID of the security group used to create new instance. It is conflict
        /// with `security_group_ids`.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// The maximum price hourly for spot instance.
        /// </summary>
        [Input("spotPriceLimit")]
        public Input<double>? SpotPriceLimit { get; set; }

        /// <summary>
        /// The spot strategy for a Pay-As-You-Go instance. Valid values: `NoSpot`, `SpotAsPriceGo`
        /// , `SpotWithPriceLimit`.
        /// </summary>
        [Input("spotStrategy")]
        public Input<string>? SpotStrategy { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource. It will be applied for ECI instances finally.
        /// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot
        /// be a null string.
        /// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be
        /// a null string.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        [Input("volumes")]
        private InputList<Inputs.EciScalingConfigurationVolumeArgs>? _volumes;

        /// <summary>
        /// The list of volumes. See `volumes` below for details.
        /// </summary>
        public InputList<Inputs.EciScalingConfigurationVolumeArgs> Volumes
        {
            get => _volumes ?? (_volumes = new InputList<Inputs.EciScalingConfigurationVolumeArgs>());
            set => _volumes = value;
        }

        public EciScalingConfigurationArgs()
        {
        }
        public static new EciScalingConfigurationArgs Empty => new EciScalingConfigurationArgs();
    }

    public sealed class EciScalingConfigurationState : global::Pulumi.ResourceArgs
    {
        [Input("acrRegistryInfos")]
        private InputList<Inputs.EciScalingConfigurationAcrRegistryInfoGetArgs>? _acrRegistryInfos;

        /// <summary>
        /// Information about the Container Registry Enterprise Edition instance. See `acr_registry_infos` below for details.
        /// </summary>
        public InputList<Inputs.EciScalingConfigurationAcrRegistryInfoGetArgs> AcrRegistryInfos
        {
            get => _acrRegistryInfos ?? (_acrRegistryInfos = new InputList<Inputs.EciScalingConfigurationAcrRegistryInfoGetArgs>());
            set => _acrRegistryInfos = value;
        }

        /// <summary>
        /// Whether active current eci scaling configuration in the specified scaling group. Note that only
        /// one configuration can be active. Default to `false`.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// Whether create eip automatically.
        /// </summary>
        [Input("autoCreateEip")]
        public Input<bool>? AutoCreateEip { get; set; }

        /// <summary>
        /// The name of the container group.
        /// </summary>
        [Input("containerGroupName")]
        public Input<string>? ContainerGroupName { get; set; }

        [Input("containers")]
        private InputList<Inputs.EciScalingConfigurationContainerGetArgs>? _containers;

        /// <summary>
        /// The list of containers. See `containers` below for details.
        /// </summary>
        public InputList<Inputs.EciScalingConfigurationContainerGetArgs> Containers
        {
            get => _containers ?? (_containers = new InputList<Inputs.EciScalingConfigurationContainerGetArgs>());
            set => _containers = value;
        }

        /// <summary>
        /// The amount of CPU resources allocated to the container group.
        /// </summary>
        [Input("cpu")]
        public Input<double>? Cpu { get; set; }

        /// <summary>
        /// The description of data disk N. Valid values of N: 1 to 16. The description must be 2 to
        /// 256 characters in length and cannot start with http:// or https://.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// dns policy of contain group.
        /// </summary>
        [Input("dnsPolicy")]
        public Input<string>? DnsPolicy { get; set; }

        /// <summary>
        /// egress bandwidth.
        /// </summary>
        [Input("egressBandwidth")]
        public Input<int>? EgressBandwidth { get; set; }

        /// <summary>
        /// Eip bandwidth.
        /// </summary>
        [Input("eipBandwidth")]
        public Input<int>? EipBandwidth { get; set; }

        /// <summary>
        /// Enable sls log service.
        /// </summary>
        [Input("enableSls")]
        public Input<bool>? EnableSls { get; set; }

        /// <summary>
        /// The eci scaling configuration will be deleted forcibly with deleting its scaling group.
        /// Default to false.
        /// </summary>
        [Input("forceDelete")]
        public Input<bool>? ForceDelete { get; set; }

        [Input("hostAliases")]
        private InputList<Inputs.EciScalingConfigurationHostAliasGetArgs>? _hostAliases;

        /// <summary>
        /// HostAliases. See `host_aliases` below.
        /// </summary>
        public InputList<Inputs.EciScalingConfigurationHostAliasGetArgs> HostAliases
        {
            get => _hostAliases ?? (_hostAliases = new InputList<Inputs.EciScalingConfigurationHostAliasGetArgs>());
            set => _hostAliases = value;
        }

        /// <summary>
        /// Hostname of an ECI instance.
        /// </summary>
        [Input("hostName")]
        public Input<string>? HostName { get; set; }

        [Input("imageRegistryCredentials")]
        private InputList<Inputs.EciScalingConfigurationImageRegistryCredentialGetArgs>? _imageRegistryCredentials;

        /// <summary>
        /// The image registry credential.   See `image_registry_credentials` below for
        /// details.
        /// </summary>
        public InputList<Inputs.EciScalingConfigurationImageRegistryCredentialGetArgs> ImageRegistryCredentials
        {
            get => _imageRegistryCredentials ?? (_imageRegistryCredentials = new InputList<Inputs.EciScalingConfigurationImageRegistryCredentialGetArgs>());
            set => _imageRegistryCredentials = value;
        }

        /// <summary>
        /// Ingress bandwidth.
        /// </summary>
        [Input("ingressBandwidth")]
        public Input<int>? IngressBandwidth { get; set; }

        [Input("initContainers")]
        private InputList<Inputs.EciScalingConfigurationInitContainerGetArgs>? _initContainers;

        /// <summary>
        /// The list of initContainers. See `init_containers` below for details.
        /// </summary>
        public InputList<Inputs.EciScalingConfigurationInitContainerGetArgs> InitContainers
        {
            get => _initContainers ?? (_initContainers = new InputList<Inputs.EciScalingConfigurationInitContainerGetArgs>());
            set => _initContainers = value;
        }

        /// <summary>
        /// The amount of memory resources allocated to the container group.
        /// </summary>
        [Input("memory")]
        public Input<double>? Memory { get; set; }

        /// <summary>
        /// The RAM role that the container group assumes. ECI and ECS share the same RAM role.
        /// </summary>
        [Input("ramRoleName")]
        public Input<string>? RamRoleName { get; set; }

        /// <summary>
        /// ID of resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The restart policy of the container group. Default to `Always`.
        /// </summary>
        [Input("restartPolicy")]
        public Input<string>? RestartPolicy { get; set; }

        /// <summary>
        /// Name shown for the scheduled task. which must contain 2-64 characters (
        /// English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number,
        /// underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is
        /// EciScalingConfigurationId.
        /// </summary>
        [Input("scalingConfigurationName")]
        public Input<string>? ScalingConfigurationName { get; set; }

        /// <summary>
        /// ID of the scaling group of a eci scaling configuration.
        /// </summary>
        [Input("scalingGroupId")]
        public Input<string>? ScalingGroupId { get; set; }

        /// <summary>
        /// ID of the security group used to create new instance. It is conflict
        /// with `security_group_ids`.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// The maximum price hourly for spot instance.
        /// </summary>
        [Input("spotPriceLimit")]
        public Input<double>? SpotPriceLimit { get; set; }

        /// <summary>
        /// The spot strategy for a Pay-As-You-Go instance. Valid values: `NoSpot`, `SpotAsPriceGo`
        /// , `SpotWithPriceLimit`.
        /// </summary>
        [Input("spotStrategy")]
        public Input<string>? SpotStrategy { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource. It will be applied for ECI instances finally.
        /// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot
        /// be a null string.
        /// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be
        /// a null string.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        [Input("volumes")]
        private InputList<Inputs.EciScalingConfigurationVolumeGetArgs>? _volumes;

        /// <summary>
        /// The list of volumes. See `volumes` below for details.
        /// </summary>
        public InputList<Inputs.EciScalingConfigurationVolumeGetArgs> Volumes
        {
            get => _volumes ?? (_volumes = new InputList<Inputs.EciScalingConfigurationVolumeGetArgs>());
            set => _volumes = value;
        }

        public EciScalingConfigurationState()
        {
        }
        public static new EciScalingConfigurationState Empty => new EciScalingConfigurationState();
    }
}
