// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess
{
    /// <summary>
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/ess_scaling_configuration.html.markdown.
    /// </summary>
    public partial class ScalingConfiguration : Pulumi.CustomResource
    {
        /// <summary>
        /// Whether active current scaling configuration in the specified scaling group. Default to `false`.
        /// </summary>
        [Output("active")]
        public Output<bool> Active { get; private set; } = null!;

        /// <summary>
        /// DataDisk mappings to attach to ecs instance. See Block datadisk below for details.
        /// </summary>
        [Output("dataDisks")]
        public Output<ImmutableArray<Outputs.ScalingConfigurationDataDisks>> DataDisks { get; private set; } = null!;

        /// <summary>
        /// Whether enable the specified scaling group(make it active) to which the current scaling configuration belongs.
        /// </summary>
        [Output("enable")]
        public Output<bool?> Enable { get; private set; } = null!;

        /// <summary>
        /// The last scaling configuration will be deleted forcibly with deleting its scaling group. Default to false.
        /// </summary>
        [Output("forceDelete")]
        public Output<bool?> ForceDelete { get; private set; } = null!;

        /// <summary>
        /// ID of an image file, indicating the image resource selected when an instance is enabled.
        /// </summary>
        [Output("imageId")]
        public Output<string> ImageId { get; private set; } = null!;

        /// <summary>
        /// It has been deprecated from version 1.6.0. New resource `alicloud.ess.Attachment` replaces it.
        /// </summary>
        [Output("instanceIds")]
        public Output<ImmutableArray<string>> InstanceIds { get; private set; } = null!;

        /// <summary>
        /// Name of an ECS instance. Default to "ESS-Instance". It is valid from version 1.7.1.
        /// </summary>
        [Output("instanceName")]
        public Output<string?> InstanceName { get; private set; } = null!;

        /// <summary>
        /// Resource type of an ECS instance.
        /// </summary>
        [Output("instanceType")]
        public Output<string?> InstanceType { get; private set; } = null!;

        /// <summary>
        /// Resource types of an ECS instance.
        /// </summary>
        [Output("instanceTypes")]
        public Output<ImmutableArray<string>> InstanceTypes { get; private set; } = null!;

        /// <summary>
        /// Network billing type, Values: PayByBandwidth or PayByTraffic. Default to `PayByBandwidth`.
        /// </summary>
        [Output("internetChargeType")]
        public Output<string?> InternetChargeType { get; private set; } = null!;

        /// <summary>
        /// Maximum incoming bandwidth from the public network, measured in Mbps (Mega bit per second). The value range is [1,200].
        /// </summary>
        [Output("internetMaxBandwidthIn")]
        public Output<int> InternetMaxBandwidthIn { get; private set; } = null!;

        /// <summary>
        /// Maximum outgoing bandwidth from the public network, measured in Mbps (Mega bit per second). The value range for PayByBandwidth is [0,100].
        /// </summary>
        [Output("internetMaxBandwidthOut")]
        public Output<int?> InternetMaxBandwidthOut { get; private set; } = null!;

        /// <summary>
        /// It has been deprecated on instance resource. All the launched alicloud instances will be I/O optimized.
        /// </summary>
        [Output("ioOptimized")]
        public Output<string?> IoOptimized { get; private set; } = null!;

        /// <summary>
        /// Whether to use outdated instance type. Default to false.
        /// </summary>
        [Output("isOutdated")]
        public Output<bool?> IsOutdated { get; private set; } = null!;

        /// <summary>
        /// The name of key pair that can login ECS instance successfully without password. If it is specified, the password would be invalid.
        /// </summary>
        [Output("keyName")]
        public Output<string?> KeyName { get; private set; } = null!;

        /// <summary>
        /// An KMS encrypts password used to a db account. If the `password` is filled in, this field will be ignored.
        /// </summary>
        [Output("kmsEncryptedPassword")]
        public Output<string?> KmsEncryptedPassword { get; private set; } = null!;

        /// <summary>
        /// An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating a db account with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        /// </summary>
        [Output("kmsEncryptionContext")]
        public Output<ImmutableDictionary<string, object>?> KmsEncryptionContext { get; private set; } = null!;

        /// <summary>
        /// Indicates whether to overwrite the existing data. Default to false.
        /// </summary>
        [Output("override")]
        public Output<bool?> Override { get; private set; } = null!;

        /// <summary>
        /// The password of the ECS instance. The password must be 8 to 30 characters in length. It must contains at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `() ~!@#$%^&amp;*-_+=\|{}[]:;'&lt;&gt;,.?/`, The password of Windows-based instances cannot start with a forward slash (/).
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to use the password that is predefined in the image. If the PasswordInherit parameter is set to true, the `password` and `kms_encrypted_password` will be ignored. You must ensure that the selected image has a password configured.
        /// </summary>
        [Output("passwordInherit")]
        public Output<bool?> PasswordInherit { get; private set; } = null!;

        /// <summary>
        /// Instance RAM role name. The name is provided and maintained by RAM. You can use `alicloud.ram.Role` to create a new one.
        /// </summary>
        [Output("roleName")]
        public Output<string?> RoleName { get; private set; } = null!;

        /// <summary>
        /// Name shown for the scheduled task. which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is ScalingConfigurationId.
        /// </summary>
        [Output("scalingConfigurationName")]
        public Output<string> ScalingConfigurationName { get; private set; } = null!;

        /// <summary>
        /// ID of the scaling group of a scaling configuration.
        /// </summary>
        [Output("scalingGroupId")]
        public Output<string> ScalingGroupId { get; private set; } = null!;

        /// <summary>
        /// ID of the security group used to create new instance. It is conflict with `security_group_ids`.
        /// </summary>
        [Output("securityGroupId")]
        public Output<string?> SecurityGroupId { get; private set; } = null!;

        /// <summary>
        /// List IDs of the security group used to create new instances. It is conflict with `security_group_id`.
        /// </summary>
        [Output("securityGroupIds")]
        public Output<ImmutableArray<string>> SecurityGroupIds { get; private set; } = null!;

        /// <summary>
        /// The another scaling configuration which will be active automatically and replace current configuration when setting `active` to 'false'. It is invalid when `active` is 'true'.
        /// </summary>
        [Output("substitute")]
        public Output<string> Substitute { get; private set; } = null!;

        /// <summary>
        /// Category of the system disk. The parameter value options are `ephemeral_ssd`, `cloud_efficiency`, `cloud_ssd`, `cloud_essd` and `cloud`. `cloud` only is used to some no I/O optimized instance. Default to `cloud_efficiency`.
        /// </summary>
        [Output("systemDiskCategory")]
        public Output<string?> SystemDiskCategory { get; private set; } = null!;

        /// <summary>
        /// Size of system disk, in GiB. Optional values: cloud: 20-500, cloud_efficiency: 20-500, cloud_ssd: 20-500, ephemeral_ssd: 20-500 The default value is max{40, ImageSize}. If this parameter is set, the system disk size must be greater than or equal to max{40, ImageSize}.
        /// </summary>
        [Output("systemDiskSize")]
        public Output<int?> SystemDiskSize { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource. It will be applied for ECS instances finally.
        /// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot be a null string.
        /// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be a null string.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// User-defined data to customize the startup behaviors of the ECS instance and to pass data into the ECS instance.
        /// </summary>
        [Output("userData")]
        public Output<string?> UserData { get; private set; } = null!;


        /// <summary>
        /// Create a ScalingConfiguration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ScalingConfiguration(string name, ScalingConfigurationArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ess/scalingConfiguration:ScalingConfiguration", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private ScalingConfiguration(string name, Input<string> id, ScalingConfigurationState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ess/scalingConfiguration:ScalingConfiguration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ScalingConfiguration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ScalingConfiguration Get(string name, Input<string> id, ScalingConfigurationState? state = null, CustomResourceOptions? options = null)
        {
            return new ScalingConfiguration(name, id, state, options);
        }
    }

    public sealed class ScalingConfigurationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether active current scaling configuration in the specified scaling group. Default to `false`.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        [Input("dataDisks")]
        private InputList<Inputs.ScalingConfigurationDataDisksArgs>? _dataDisks;

        /// <summary>
        /// DataDisk mappings to attach to ecs instance. See Block datadisk below for details.
        /// </summary>
        public InputList<Inputs.ScalingConfigurationDataDisksArgs> DataDisks
        {
            get => _dataDisks ?? (_dataDisks = new InputList<Inputs.ScalingConfigurationDataDisksArgs>());
            set => _dataDisks = value;
        }

        /// <summary>
        /// Whether enable the specified scaling group(make it active) to which the current scaling configuration belongs.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// The last scaling configuration will be deleted forcibly with deleting its scaling group. Default to false.
        /// </summary>
        [Input("forceDelete")]
        public Input<bool>? ForceDelete { get; set; }

        /// <summary>
        /// ID of an image file, indicating the image resource selected when an instance is enabled.
        /// </summary>
        [Input("imageId", required: true)]
        public Input<string> ImageId { get; set; } = null!;

        [Input("instanceIds")]
        private InputList<string>? _instanceIds;

        /// <summary>
        /// It has been deprecated from version 1.6.0. New resource `alicloud.ess.Attachment` replaces it.
        /// </summary>
        public InputList<string> InstanceIds
        {
            get => _instanceIds ?? (_instanceIds = new InputList<string>());
            set => _instanceIds = value;
        }

        /// <summary>
        /// Name of an ECS instance. Default to "ESS-Instance". It is valid from version 1.7.1.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// Resource type of an ECS instance.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        [Input("instanceTypes")]
        private InputList<string>? _instanceTypes;

        /// <summary>
        /// Resource types of an ECS instance.
        /// </summary>
        public InputList<string> InstanceTypes
        {
            get => _instanceTypes ?? (_instanceTypes = new InputList<string>());
            set => _instanceTypes = value;
        }

        /// <summary>
        /// Network billing type, Values: PayByBandwidth or PayByTraffic. Default to `PayByBandwidth`.
        /// </summary>
        [Input("internetChargeType")]
        public Input<string>? InternetChargeType { get; set; }

        /// <summary>
        /// Maximum incoming bandwidth from the public network, measured in Mbps (Mega bit per second). The value range is [1,200].
        /// </summary>
        [Input("internetMaxBandwidthIn")]
        public Input<int>? InternetMaxBandwidthIn { get; set; }

        /// <summary>
        /// Maximum outgoing bandwidth from the public network, measured in Mbps (Mega bit per second). The value range for PayByBandwidth is [0,100].
        /// </summary>
        [Input("internetMaxBandwidthOut")]
        public Input<int>? InternetMaxBandwidthOut { get; set; }

        /// <summary>
        /// It has been deprecated on instance resource. All the launched alicloud instances will be I/O optimized.
        /// </summary>
        [Input("ioOptimized")]
        public Input<string>? IoOptimized { get; set; }

        /// <summary>
        /// Whether to use outdated instance type. Default to false.
        /// </summary>
        [Input("isOutdated")]
        public Input<bool>? IsOutdated { get; set; }

        /// <summary>
        /// The name of key pair that can login ECS instance successfully without password. If it is specified, the password would be invalid.
        /// </summary>
        [Input("keyName")]
        public Input<string>? KeyName { get; set; }

        /// <summary>
        /// An KMS encrypts password used to a db account. If the `password` is filled in, this field will be ignored.
        /// </summary>
        [Input("kmsEncryptedPassword")]
        public Input<string>? KmsEncryptedPassword { get; set; }

        [Input("kmsEncryptionContext")]
        private InputMap<object>? _kmsEncryptionContext;

        /// <summary>
        /// An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating a db account with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        /// </summary>
        public InputMap<object> KmsEncryptionContext
        {
            get => _kmsEncryptionContext ?? (_kmsEncryptionContext = new InputMap<object>());
            set => _kmsEncryptionContext = value;
        }

        /// <summary>
        /// Indicates whether to overwrite the existing data. Default to false.
        /// </summary>
        [Input("override")]
        public Input<bool>? Override { get; set; }

        /// <summary>
        /// The password of the ECS instance. The password must be 8 to 30 characters in length. It must contains at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `() ~!@#$%^&amp;*-_+=\|{}[]:;'&lt;&gt;,.?/`, The password of Windows-based instances cannot start with a forward slash (/).
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Specifies whether to use the password that is predefined in the image. If the PasswordInherit parameter is set to true, the `password` and `kms_encrypted_password` will be ignored. You must ensure that the selected image has a password configured.
        /// </summary>
        [Input("passwordInherit")]
        public Input<bool>? PasswordInherit { get; set; }

        /// <summary>
        /// Instance RAM role name. The name is provided and maintained by RAM. You can use `alicloud.ram.Role` to create a new one.
        /// </summary>
        [Input("roleName")]
        public Input<string>? RoleName { get; set; }

        /// <summary>
        /// Name shown for the scheduled task. which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is ScalingConfigurationId.
        /// </summary>
        [Input("scalingConfigurationName")]
        public Input<string>? ScalingConfigurationName { get; set; }

        /// <summary>
        /// ID of the scaling group of a scaling configuration.
        /// </summary>
        [Input("scalingGroupId", required: true)]
        public Input<string> ScalingGroupId { get; set; } = null!;

        /// <summary>
        /// ID of the security group used to create new instance. It is conflict with `security_group_ids`.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// List IDs of the security group used to create new instances. It is conflict with `security_group_id`.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        /// <summary>
        /// The another scaling configuration which will be active automatically and replace current configuration when setting `active` to 'false'. It is invalid when `active` is 'true'.
        /// </summary>
        [Input("substitute")]
        public Input<string>? Substitute { get; set; }

        /// <summary>
        /// Category of the system disk. The parameter value options are `ephemeral_ssd`, `cloud_efficiency`, `cloud_ssd`, `cloud_essd` and `cloud`. `cloud` only is used to some no I/O optimized instance. Default to `cloud_efficiency`.
        /// </summary>
        [Input("systemDiskCategory")]
        public Input<string>? SystemDiskCategory { get; set; }

        /// <summary>
        /// Size of system disk, in GiB. Optional values: cloud: 20-500, cloud_efficiency: 20-500, cloud_ssd: 20-500, ephemeral_ssd: 20-500 The default value is max{40, ImageSize}. If this parameter is set, the system disk size must be greater than or equal to max{40, ImageSize}.
        /// </summary>
        [Input("systemDiskSize")]
        public Input<int>? SystemDiskSize { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource. It will be applied for ECS instances finally.
        /// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot be a null string.
        /// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be a null string.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// User-defined data to customize the startup behaviors of the ECS instance and to pass data into the ECS instance.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        public ScalingConfigurationArgs()
        {
        }
    }

    public sealed class ScalingConfigurationState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether active current scaling configuration in the specified scaling group. Default to `false`.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        [Input("dataDisks")]
        private InputList<Inputs.ScalingConfigurationDataDisksGetArgs>? _dataDisks;

        /// <summary>
        /// DataDisk mappings to attach to ecs instance. See Block datadisk below for details.
        /// </summary>
        public InputList<Inputs.ScalingConfigurationDataDisksGetArgs> DataDisks
        {
            get => _dataDisks ?? (_dataDisks = new InputList<Inputs.ScalingConfigurationDataDisksGetArgs>());
            set => _dataDisks = value;
        }

        /// <summary>
        /// Whether enable the specified scaling group(make it active) to which the current scaling configuration belongs.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// The last scaling configuration will be deleted forcibly with deleting its scaling group. Default to false.
        /// </summary>
        [Input("forceDelete")]
        public Input<bool>? ForceDelete { get; set; }

        /// <summary>
        /// ID of an image file, indicating the image resource selected when an instance is enabled.
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        [Input("instanceIds")]
        private InputList<string>? _instanceIds;

        /// <summary>
        /// It has been deprecated from version 1.6.0. New resource `alicloud.ess.Attachment` replaces it.
        /// </summary>
        public InputList<string> InstanceIds
        {
            get => _instanceIds ?? (_instanceIds = new InputList<string>());
            set => _instanceIds = value;
        }

        /// <summary>
        /// Name of an ECS instance. Default to "ESS-Instance". It is valid from version 1.7.1.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// Resource type of an ECS instance.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        [Input("instanceTypes")]
        private InputList<string>? _instanceTypes;

        /// <summary>
        /// Resource types of an ECS instance.
        /// </summary>
        public InputList<string> InstanceTypes
        {
            get => _instanceTypes ?? (_instanceTypes = new InputList<string>());
            set => _instanceTypes = value;
        }

        /// <summary>
        /// Network billing type, Values: PayByBandwidth or PayByTraffic. Default to `PayByBandwidth`.
        /// </summary>
        [Input("internetChargeType")]
        public Input<string>? InternetChargeType { get; set; }

        /// <summary>
        /// Maximum incoming bandwidth from the public network, measured in Mbps (Mega bit per second). The value range is [1,200].
        /// </summary>
        [Input("internetMaxBandwidthIn")]
        public Input<int>? InternetMaxBandwidthIn { get; set; }

        /// <summary>
        /// Maximum outgoing bandwidth from the public network, measured in Mbps (Mega bit per second). The value range for PayByBandwidth is [0,100].
        /// </summary>
        [Input("internetMaxBandwidthOut")]
        public Input<int>? InternetMaxBandwidthOut { get; set; }

        /// <summary>
        /// It has been deprecated on instance resource. All the launched alicloud instances will be I/O optimized.
        /// </summary>
        [Input("ioOptimized")]
        public Input<string>? IoOptimized { get; set; }

        /// <summary>
        /// Whether to use outdated instance type. Default to false.
        /// </summary>
        [Input("isOutdated")]
        public Input<bool>? IsOutdated { get; set; }

        /// <summary>
        /// The name of key pair that can login ECS instance successfully without password. If it is specified, the password would be invalid.
        /// </summary>
        [Input("keyName")]
        public Input<string>? KeyName { get; set; }

        /// <summary>
        /// An KMS encrypts password used to a db account. If the `password` is filled in, this field will be ignored.
        /// </summary>
        [Input("kmsEncryptedPassword")]
        public Input<string>? KmsEncryptedPassword { get; set; }

        [Input("kmsEncryptionContext")]
        private InputMap<object>? _kmsEncryptionContext;

        /// <summary>
        /// An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating a db account with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        /// </summary>
        public InputMap<object> KmsEncryptionContext
        {
            get => _kmsEncryptionContext ?? (_kmsEncryptionContext = new InputMap<object>());
            set => _kmsEncryptionContext = value;
        }

        /// <summary>
        /// Indicates whether to overwrite the existing data. Default to false.
        /// </summary>
        [Input("override")]
        public Input<bool>? Override { get; set; }

        /// <summary>
        /// The password of the ECS instance. The password must be 8 to 30 characters in length. It must contains at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `() ~!@#$%^&amp;*-_+=\|{}[]:;'&lt;&gt;,.?/`, The password of Windows-based instances cannot start with a forward slash (/).
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Specifies whether to use the password that is predefined in the image. If the PasswordInherit parameter is set to true, the `password` and `kms_encrypted_password` will be ignored. You must ensure that the selected image has a password configured.
        /// </summary>
        [Input("passwordInherit")]
        public Input<bool>? PasswordInherit { get; set; }

        /// <summary>
        /// Instance RAM role name. The name is provided and maintained by RAM. You can use `alicloud.ram.Role` to create a new one.
        /// </summary>
        [Input("roleName")]
        public Input<string>? RoleName { get; set; }

        /// <summary>
        /// Name shown for the scheduled task. which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is ScalingConfigurationId.
        /// </summary>
        [Input("scalingConfigurationName")]
        public Input<string>? ScalingConfigurationName { get; set; }

        /// <summary>
        /// ID of the scaling group of a scaling configuration.
        /// </summary>
        [Input("scalingGroupId")]
        public Input<string>? ScalingGroupId { get; set; }

        /// <summary>
        /// ID of the security group used to create new instance. It is conflict with `security_group_ids`.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// List IDs of the security group used to create new instances. It is conflict with `security_group_id`.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        /// <summary>
        /// The another scaling configuration which will be active automatically and replace current configuration when setting `active` to 'false'. It is invalid when `active` is 'true'.
        /// </summary>
        [Input("substitute")]
        public Input<string>? Substitute { get; set; }

        /// <summary>
        /// Category of the system disk. The parameter value options are `ephemeral_ssd`, `cloud_efficiency`, `cloud_ssd`, `cloud_essd` and `cloud`. `cloud` only is used to some no I/O optimized instance. Default to `cloud_efficiency`.
        /// </summary>
        [Input("systemDiskCategory")]
        public Input<string>? SystemDiskCategory { get; set; }

        /// <summary>
        /// Size of system disk, in GiB. Optional values: cloud: 20-500, cloud_efficiency: 20-500, cloud_ssd: 20-500, ephemeral_ssd: 20-500 The default value is max{40, ImageSize}. If this parameter is set, the system disk size must be greater than or equal to max{40, ImageSize}.
        /// </summary>
        [Input("systemDiskSize")]
        public Input<int>? SystemDiskSize { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource. It will be applied for ECS instances finally.
        /// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot be a null string.
        /// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be a null string.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// User-defined data to customize the startup behaviors of the ECS instance and to pass data into the ECS instance.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        public ScalingConfigurationState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class ScalingConfigurationDataDisksArgs : Pulumi.ResourceArgs
    {
        [Input("category")]
        public Input<string>? Category { get; set; }

        [Input("deleteWithInstance")]
        public Input<bool>? DeleteWithInstance { get; set; }

        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("size")]
        public Input<int>? Size { get; set; }

        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        public ScalingConfigurationDataDisksArgs()
        {
        }
    }

    public sealed class ScalingConfigurationDataDisksGetArgs : Pulumi.ResourceArgs
    {
        [Input("category")]
        public Input<string>? Category { get; set; }

        [Input("deleteWithInstance")]
        public Input<bool>? DeleteWithInstance { get; set; }

        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("size")]
        public Input<int>? Size { get; set; }

        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        public ScalingConfigurationDataDisksGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class ScalingConfigurationDataDisks
    {
        public readonly string? Category;
        public readonly bool? DeleteWithInstance;
        public readonly string? Device;
        public readonly int? Size;
        public readonly string? SnapshotId;

        [OutputConstructor]
        private ScalingConfigurationDataDisks(
            string? category,
            bool? deleteWithInstance,
            string? device,
            int? size,
            string? snapshotId)
        {
            Category = category;
            DeleteWithInstance = deleteWithInstance;
            Device = device;
            Size = size;
            SnapshotId = snapshotId;
        }
    }
    }
}