// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ens
{
    /// <summary>
    /// ## Import
    /// 
    /// ENS Instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ens/instance:Instance example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ens/instance:Instance")]
    public partial class Instance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The number of instances created, with a minimum of 1 and a maximum of 100.
        /// </summary>
        [Output("amount")]
        public Output<int?> Amount { get; private set; } = null!;

        /// <summary>
        /// Whether to automatically renew the logo. The default value is false. This parameter is invalid when you pay by volume.
        /// </summary>
        [Output("autoRenew")]
        public Output<bool?> AutoRenew { get; private set; } = null!;

        /// <summary>
        /// Whether to use vouchers. The default is to use. Value:
        /// - true (used)
        /// - false (not used).
        /// </summary>
        [Output("autoUseCoupon")]
        public Output<string?> AutoUseCoupon { get; private set; } = null!;

        /// <summary>
        /// The billing cycle for instance computing resources. Only instance-level pay-as-you-go is supported. Value
        /// - Hour: hourly billing
        /// - Day: Daily billing
        /// - Month: monthly billing.
        /// </summary>
        [Output("billingCycle")]
        public Output<string?> BillingCycle { get; private set; } = null!;

        /// <summary>
        /// Operator, required for regional scheduling. Optional values:
        /// - cmcc (mobile)
        /// - unicom
        /// - telecom.
        /// </summary>
        [Output("carrier")]
        public Output<string?> Carrier { get; private set; } = null!;

        /// <summary>
        /// Data disk specifications. See `data_disk` below.
        /// </summary>
        [Output("dataDisks")]
        public Output<ImmutableArray<Outputs.InstanceDataDisk>> DataDisks { get; private set; } = null!;

        /// <summary>
        /// The node ID. When ScheduleAreaLevel is Region, EnsRegionId is required. When ScheduleAreaLevel is Big,Middle,Small, EnsRegionId is invalid.
        /// </summary>
        [Output("ensRegionId")]
        public Output<string> EnsRegionId { get; private set; } = null!;

        /// <summary>
        /// Whether to force the identity when operating the instance. Optional values:
        /// - true: Force
        /// - false (default): non-mandatory
        /// </summary>
        [Output("forceStop")]
        public Output<string?> ForceStop { get; private set; } = null!;

        /// <summary>
        /// The host name of the instance. Example value: test-HostName.
        /// </summary>
        [Output("hostName")]
        public Output<string> HostName { get; private set; } = null!;

        /// <summary>
        /// The image ID of the instance. The arm version card cannot be filled in. Other specifications are required. Example value: m-5si16wo6simkt267p8b7h * * * *.
        /// </summary>
        [Output("imageId")]
        public Output<string?> ImageId { get; private set; } = null!;

        /// <summary>
        /// Whether the Payment type of the disk created with the instance is converted.
        /// </summary>
        [Output("includeDataDisks")]
        public Output<bool?> IncludeDataDisks { get; private set; } = null!;

        /// <summary>
        /// The instance billing policy. Optional values:
        /// - instance: instance granularity (the subscription method does not support instance)
        /// - user: user Dimension (user is not transmitted or supported in the prepaid mode).
        /// </summary>
        [Output("instanceChargeStrategy")]
        public Output<string?> InstanceChargeStrategy { get; private set; } = null!;

        /// <summary>
        /// The instance name. Example value: test-InstanceName. It must be 2 to 128 characters in length and must start with an uppercase or lowercase letter or a Chinese character. It cannot start with http:// or https. Can contain Chinese, English, numbers, half-width colons (:), underscores (_), periods (.), or hyphens (-) The default value is the InstanceId of the instance. .
        /// </summary>
        [Output("instanceName")]
        public Output<string> InstanceName { get; private set; } = null!;

        /// <summary>
        /// The specification of the instance. Example value: ens.sn1.small.
        /// </summary>
        [Output("instanceType")]
        public Output<string> InstanceType { get; private set; } = null!;

        /// <summary>
        /// Instance bandwidth billing method. If the billing method can be selected for the first purchase, the subsequent value of this field will be processed by default according to the billing method selected for the first time. Optional values:
        /// - BandwidthByDay: Daily peak bandwidth
        /// - 95bandwidthbymonth: 95 peak bandwidth.
        /// </summary>
        [Output("internetChargeType")]
        public Output<string?> InternetChargeType { get; private set; } = null!;

        /// <summary>
        /// Maximum public network bandwidth. The field type is Long, and the precision may be lost during serialization/deserialization. Please note that the value must not be greater than 9007199254740991.
        /// </summary>
        [Output("internetMaxBandwidthOut")]
        public Output<int> InternetMaxBandwidthOut { get; private set; } = null!;

        /// <summary>
        /// The IP type. Value:
        /// - ipv4 (default):IPv4
        /// - ipv6:IPv6
        /// - ipv4Andipv6:IPv4 and IPv6.
        /// </summary>
        [Output("ipType")]
        public Output<string?> IpType { get; private set; } = null!;

        /// <summary>
        /// The area code. Example value: 350000. Required for regional-level scheduling, invalid for node-level scheduling.
        /// </summary>
        [Output("netDistrictCode")]
        public Output<string?> NetDistrictCode { get; private set; } = null!;

        /// <summary>
        /// The network ID of the instance. Can only be used in node-level scheduling.
        /// </summary>
        [Output("netWorkId")]
        public Output<string> NetWorkId { get; private set; } = null!;

        /// <summary>
        /// The instance password. At least one of Password, KeyPairName, and PasswordInherit.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// Whether to use image preset password prompt: Password and KeyPairNamePasswordInherit must be passed.
        /// </summary>
        [Output("passwordInherit")]
        public Output<bool?> PasswordInherit { get; private set; } = null!;

        /// <summary>
        /// Instance payment method. Optional values:
        /// - Subscription: prepaid, annual and monthly
        /// - PayAsYouGo: Pay by volume.
        /// </summary>
        [Output("paymentType")]
        public Output<string> PaymentType { get; private set; } = null!;

        /// <summary>
        /// The duration of the resource purchase. Value method:
        /// - If PeriodUnit is set to Day, Period can only be set to 3.
        /// - If PeriodUnit is set to Month, Period can be set to 1-9,12.
        /// </summary>
        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// The unit of time for purchasing resources. Value:
        /// - Month (default): purchase by Month
        /// - Day: buy by Day.
        /// </summary>
        [Output("periodUnit")]
        public Output<string?> PeriodUnit { get; private set; } = null!;

        /// <summary>
        /// The private IP address. Can only be used for node-level scheduling. If a private IP address is specified, the number of instances can only be one, and both the private IP address and the vSwitch ID are not empty, the private IP address takes effect.
        /// </summary>
        [Output("privateIpAddress")]
        public Output<string> PrivateIpAddress { get; private set; } = null!;

        /// <summary>
        /// Whether to assign a public IP identifier. Value:
        /// - true (default): Assign
        /// - false: do not assign.
        /// </summary>
        [Output("publicIpIdentification")]
        public Output<bool?> PublicIpIdentification { get; private set; } = null!;

        /// <summary>
        /// Scheduling level, through which node-level scheduling or area scheduling is performed. Optional values:
        /// - Node-level scheduling: Region
        /// - Regional scheduling: Big (region),Middle (province),Small (city).
        /// </summary>
        [Output("scheduleAreaLevel")]
        public Output<string> ScheduleAreaLevel { get; private set; } = null!;

        /// <summary>
        /// Scheduling price policy. If it is not filled in, the default priority is low price. Value:
        /// - PriceLowPriority
        /// - PriceLowPriority (priority low price).
        /// </summary>
        [Output("schedulingPriceStrategy")]
        public Output<string?> SchedulingPriceStrategy { get; private set; } = null!;

        /// <summary>
        /// Scheduling policy. Optional values:
        /// - Concentrate for node-level scheduling
        /// - For regional scheduling, Concentrate, Disperse.
        /// </summary>
        [Output("schedulingStrategy")]
        public Output<string?> SchedulingStrategy { get; private set; } = null!;

        /// <summary>
        /// ID of the security group to which the instance belongs.
        /// </summary>
        [Output("securityId")]
        public Output<string> SecurityId { get; private set; } = null!;

        /// <summary>
        /// Status of the instance.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// System Disk Specification. SystemDisk is a non-required parameter when InstanceType is x86_pm,x86_bmi,x86_bm,pc_bmi, or arm_bmi. SystemDisk is a required parameter when instanceType is other specification families. See `system_disk` below.
        /// </summary>
        [Output("systemDisk")]
        public Output<Outputs.InstanceSystemDisk?> SystemDisk { get; private set; } = null!;

        /// <summary>
        /// Indicates whether to add an ordered suffix to HostName and InstanceName. The ordered suffix starts from 001 and cannot exceed 999.
        /// </summary>
        [Output("uniqueSuffix")]
        public Output<bool?> UniqueSuffix { get; private set; } = null!;

        /// <summary>
        /// User-defined data, maximum support 16KB. You can pass in the UserData information. The UserData is encoded in Base64 format.
        /// </summary>
        [Output("userData")]
        public Output<string?> UserData { get; private set; } = null!;

        /// <summary>
        /// The ID of the vSwitch to which the instance belongs. Can only be used in node-level scheduling.
        /// </summary>
        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;


        /// <summary>
        /// Create a Instance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Instance(string name, InstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ens/instance:Instance", name, args ?? new InstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Instance(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ens/instance:Instance", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Instance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Instance Get(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new Instance(name, id, state, options);
        }
    }

    public sealed class InstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of instances created, with a minimum of 1 and a maximum of 100.
        /// </summary>
        [Input("amount")]
        public Input<int>? Amount { get; set; }

        /// <summary>
        /// Whether to automatically renew the logo. The default value is false. This parameter is invalid when you pay by volume.
        /// </summary>
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        /// <summary>
        /// Whether to use vouchers. The default is to use. Value:
        /// - true (used)
        /// - false (not used).
        /// </summary>
        [Input("autoUseCoupon")]
        public Input<string>? AutoUseCoupon { get; set; }

        /// <summary>
        /// The billing cycle for instance computing resources. Only instance-level pay-as-you-go is supported. Value
        /// - Hour: hourly billing
        /// - Day: Daily billing
        /// - Month: monthly billing.
        /// </summary>
        [Input("billingCycle")]
        public Input<string>? BillingCycle { get; set; }

        /// <summary>
        /// Operator, required for regional scheduling. Optional values:
        /// - cmcc (mobile)
        /// - unicom
        /// - telecom.
        /// </summary>
        [Input("carrier")]
        public Input<string>? Carrier { get; set; }

        [Input("dataDisks")]
        private InputList<Inputs.InstanceDataDiskArgs>? _dataDisks;

        /// <summary>
        /// Data disk specifications. See `data_disk` below.
        /// </summary>
        public InputList<Inputs.InstanceDataDiskArgs> DataDisks
        {
            get => _dataDisks ?? (_dataDisks = new InputList<Inputs.InstanceDataDiskArgs>());
            set => _dataDisks = value;
        }

        /// <summary>
        /// The node ID. When ScheduleAreaLevel is Region, EnsRegionId is required. When ScheduleAreaLevel is Big,Middle,Small, EnsRegionId is invalid.
        /// </summary>
        [Input("ensRegionId")]
        public Input<string>? EnsRegionId { get; set; }

        /// <summary>
        /// Whether to force the identity when operating the instance. Optional values:
        /// - true: Force
        /// - false (default): non-mandatory
        /// </summary>
        [Input("forceStop")]
        public Input<string>? ForceStop { get; set; }

        /// <summary>
        /// The host name of the instance. Example value: test-HostName.
        /// </summary>
        [Input("hostName")]
        public Input<string>? HostName { get; set; }

        /// <summary>
        /// The image ID of the instance. The arm version card cannot be filled in. Other specifications are required. Example value: m-5si16wo6simkt267p8b7h * * * *.
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        /// <summary>
        /// Whether the Payment type of the disk created with the instance is converted.
        /// </summary>
        [Input("includeDataDisks")]
        public Input<bool>? IncludeDataDisks { get; set; }

        /// <summary>
        /// The instance billing policy. Optional values:
        /// - instance: instance granularity (the subscription method does not support instance)
        /// - user: user Dimension (user is not transmitted or supported in the prepaid mode).
        /// </summary>
        [Input("instanceChargeStrategy")]
        public Input<string>? InstanceChargeStrategy { get; set; }

        /// <summary>
        /// The instance name. Example value: test-InstanceName. It must be 2 to 128 characters in length and must start with an uppercase or lowercase letter or a Chinese character. It cannot start with http:// or https. Can contain Chinese, English, numbers, half-width colons (:), underscores (_), periods (.), or hyphens (-) The default value is the InstanceId of the instance. .
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// The specification of the instance. Example value: ens.sn1.small.
        /// </summary>
        [Input("instanceType", required: true)]
        public Input<string> InstanceType { get; set; } = null!;

        /// <summary>
        /// Instance bandwidth billing method. If the billing method can be selected for the first purchase, the subsequent value of this field will be processed by default according to the billing method selected for the first time. Optional values:
        /// - BandwidthByDay: Daily peak bandwidth
        /// - 95bandwidthbymonth: 95 peak bandwidth.
        /// </summary>
        [Input("internetChargeType")]
        public Input<string>? InternetChargeType { get; set; }

        /// <summary>
        /// Maximum public network bandwidth. The field type is Long, and the precision may be lost during serialization/deserialization. Please note that the value must not be greater than 9007199254740991.
        /// </summary>
        [Input("internetMaxBandwidthOut", required: true)]
        public Input<int> InternetMaxBandwidthOut { get; set; } = null!;

        /// <summary>
        /// The IP type. Value:
        /// - ipv4 (default):IPv4
        /// - ipv6:IPv6
        /// - ipv4Andipv6:IPv4 and IPv6.
        /// </summary>
        [Input("ipType")]
        public Input<string>? IpType { get; set; }

        /// <summary>
        /// The area code. Example value: 350000. Required for regional-level scheduling, invalid for node-level scheduling.
        /// </summary>
        [Input("netDistrictCode")]
        public Input<string>? NetDistrictCode { get; set; }

        /// <summary>
        /// The network ID of the instance. Can only be used in node-level scheduling.
        /// </summary>
        [Input("netWorkId")]
        public Input<string>? NetWorkId { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The instance password. At least one of Password, KeyPairName, and PasswordInherit.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Whether to use image preset password prompt: Password and KeyPairNamePasswordInherit must be passed.
        /// </summary>
        [Input("passwordInherit")]
        public Input<bool>? PasswordInherit { get; set; }

        /// <summary>
        /// Instance payment method. Optional values:
        /// - Subscription: prepaid, annual and monthly
        /// - PayAsYouGo: Pay by volume.
        /// </summary>
        [Input("paymentType", required: true)]
        public Input<string> PaymentType { get; set; } = null!;

        /// <summary>
        /// The duration of the resource purchase. Value method:
        /// - If PeriodUnit is set to Day, Period can only be set to 3.
        /// - If PeriodUnit is set to Month, Period can be set to 1-9,12.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The unit of time for purchasing resources. Value:
        /// - Month (default): purchase by Month
        /// - Day: buy by Day.
        /// </summary>
        [Input("periodUnit")]
        public Input<string>? PeriodUnit { get; set; }

        /// <summary>
        /// The private IP address. Can only be used for node-level scheduling. If a private IP address is specified, the number of instances can only be one, and both the private IP address and the vSwitch ID are not empty, the private IP address takes effect.
        /// </summary>
        [Input("privateIpAddress")]
        public Input<string>? PrivateIpAddress { get; set; }

        /// <summary>
        /// Whether to assign a public IP identifier. Value:
        /// - true (default): Assign
        /// - false: do not assign.
        /// </summary>
        [Input("publicIpIdentification")]
        public Input<bool>? PublicIpIdentification { get; set; }

        /// <summary>
        /// Scheduling level, through which node-level scheduling or area scheduling is performed. Optional values:
        /// - Node-level scheduling: Region
        /// - Regional scheduling: Big (region),Middle (province),Small (city).
        /// </summary>
        [Input("scheduleAreaLevel", required: true)]
        public Input<string> ScheduleAreaLevel { get; set; } = null!;

        /// <summary>
        /// Scheduling price policy. If it is not filled in, the default priority is low price. Value:
        /// - PriceLowPriority
        /// - PriceLowPriority (priority low price).
        /// </summary>
        [Input("schedulingPriceStrategy")]
        public Input<string>? SchedulingPriceStrategy { get; set; }

        /// <summary>
        /// Scheduling policy. Optional values:
        /// - Concentrate for node-level scheduling
        /// - For regional scheduling, Concentrate, Disperse.
        /// </summary>
        [Input("schedulingStrategy")]
        public Input<string>? SchedulingStrategy { get; set; }

        /// <summary>
        /// ID of the security group to which the instance belongs.
        /// </summary>
        [Input("securityId")]
        public Input<string>? SecurityId { get; set; }

        /// <summary>
        /// Status of the instance.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// System Disk Specification. SystemDisk is a non-required parameter when InstanceType is x86_pm,x86_bmi,x86_bm,pc_bmi, or arm_bmi. SystemDisk is a required parameter when instanceType is other specification families. See `system_disk` below.
        /// </summary>
        [Input("systemDisk")]
        public Input<Inputs.InstanceSystemDiskArgs>? SystemDisk { get; set; }

        /// <summary>
        /// Indicates whether to add an ordered suffix to HostName and InstanceName. The ordered suffix starts from 001 and cannot exceed 999.
        /// </summary>
        [Input("uniqueSuffix")]
        public Input<bool>? UniqueSuffix { get; set; }

        /// <summary>
        /// User-defined data, maximum support 16KB. You can pass in the UserData information. The UserData is encoded in Base64 format.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        /// <summary>
        /// The ID of the vSwitch to which the instance belongs. Can only be used in node-level scheduling.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public InstanceArgs()
        {
        }
        public static new InstanceArgs Empty => new InstanceArgs();
    }

    public sealed class InstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of instances created, with a minimum of 1 and a maximum of 100.
        /// </summary>
        [Input("amount")]
        public Input<int>? Amount { get; set; }

        /// <summary>
        /// Whether to automatically renew the logo. The default value is false. This parameter is invalid when you pay by volume.
        /// </summary>
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        /// <summary>
        /// Whether to use vouchers. The default is to use. Value:
        /// - true (used)
        /// - false (not used).
        /// </summary>
        [Input("autoUseCoupon")]
        public Input<string>? AutoUseCoupon { get; set; }

        /// <summary>
        /// The billing cycle for instance computing resources. Only instance-level pay-as-you-go is supported. Value
        /// - Hour: hourly billing
        /// - Day: Daily billing
        /// - Month: monthly billing.
        /// </summary>
        [Input("billingCycle")]
        public Input<string>? BillingCycle { get; set; }

        /// <summary>
        /// Operator, required for regional scheduling. Optional values:
        /// - cmcc (mobile)
        /// - unicom
        /// - telecom.
        /// </summary>
        [Input("carrier")]
        public Input<string>? Carrier { get; set; }

        [Input("dataDisks")]
        private InputList<Inputs.InstanceDataDiskGetArgs>? _dataDisks;

        /// <summary>
        /// Data disk specifications. See `data_disk` below.
        /// </summary>
        public InputList<Inputs.InstanceDataDiskGetArgs> DataDisks
        {
            get => _dataDisks ?? (_dataDisks = new InputList<Inputs.InstanceDataDiskGetArgs>());
            set => _dataDisks = value;
        }

        /// <summary>
        /// The node ID. When ScheduleAreaLevel is Region, EnsRegionId is required. When ScheduleAreaLevel is Big,Middle,Small, EnsRegionId is invalid.
        /// </summary>
        [Input("ensRegionId")]
        public Input<string>? EnsRegionId { get; set; }

        /// <summary>
        /// Whether to force the identity when operating the instance. Optional values:
        /// - true: Force
        /// - false (default): non-mandatory
        /// </summary>
        [Input("forceStop")]
        public Input<string>? ForceStop { get; set; }

        /// <summary>
        /// The host name of the instance. Example value: test-HostName.
        /// </summary>
        [Input("hostName")]
        public Input<string>? HostName { get; set; }

        /// <summary>
        /// The image ID of the instance. The arm version card cannot be filled in. Other specifications are required. Example value: m-5si16wo6simkt267p8b7h * * * *.
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        /// <summary>
        /// Whether the Payment type of the disk created with the instance is converted.
        /// </summary>
        [Input("includeDataDisks")]
        public Input<bool>? IncludeDataDisks { get; set; }

        /// <summary>
        /// The instance billing policy. Optional values:
        /// - instance: instance granularity (the subscription method does not support instance)
        /// - user: user Dimension (user is not transmitted or supported in the prepaid mode).
        /// </summary>
        [Input("instanceChargeStrategy")]
        public Input<string>? InstanceChargeStrategy { get; set; }

        /// <summary>
        /// The instance name. Example value: test-InstanceName. It must be 2 to 128 characters in length and must start with an uppercase or lowercase letter or a Chinese character. It cannot start with http:// or https. Can contain Chinese, English, numbers, half-width colons (:), underscores (_), periods (.), or hyphens (-) The default value is the InstanceId of the instance. .
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// The specification of the instance. Example value: ens.sn1.small.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// Instance bandwidth billing method. If the billing method can be selected for the first purchase, the subsequent value of this field will be processed by default according to the billing method selected for the first time. Optional values:
        /// - BandwidthByDay: Daily peak bandwidth
        /// - 95bandwidthbymonth: 95 peak bandwidth.
        /// </summary>
        [Input("internetChargeType")]
        public Input<string>? InternetChargeType { get; set; }

        /// <summary>
        /// Maximum public network bandwidth. The field type is Long, and the precision may be lost during serialization/deserialization. Please note that the value must not be greater than 9007199254740991.
        /// </summary>
        [Input("internetMaxBandwidthOut")]
        public Input<int>? InternetMaxBandwidthOut { get; set; }

        /// <summary>
        /// The IP type. Value:
        /// - ipv4 (default):IPv4
        /// - ipv6:IPv6
        /// - ipv4Andipv6:IPv4 and IPv6.
        /// </summary>
        [Input("ipType")]
        public Input<string>? IpType { get; set; }

        /// <summary>
        /// The area code. Example value: 350000. Required for regional-level scheduling, invalid for node-level scheduling.
        /// </summary>
        [Input("netDistrictCode")]
        public Input<string>? NetDistrictCode { get; set; }

        /// <summary>
        /// The network ID of the instance. Can only be used in node-level scheduling.
        /// </summary>
        [Input("netWorkId")]
        public Input<string>? NetWorkId { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The instance password. At least one of Password, KeyPairName, and PasswordInherit.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Whether to use image preset password prompt: Password and KeyPairNamePasswordInherit must be passed.
        /// </summary>
        [Input("passwordInherit")]
        public Input<bool>? PasswordInherit { get; set; }

        /// <summary>
        /// Instance payment method. Optional values:
        /// - Subscription: prepaid, annual and monthly
        /// - PayAsYouGo: Pay by volume.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// The duration of the resource purchase. Value method:
        /// - If PeriodUnit is set to Day, Period can only be set to 3.
        /// - If PeriodUnit is set to Month, Period can be set to 1-9,12.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The unit of time for purchasing resources. Value:
        /// - Month (default): purchase by Month
        /// - Day: buy by Day.
        /// </summary>
        [Input("periodUnit")]
        public Input<string>? PeriodUnit { get; set; }

        /// <summary>
        /// The private IP address. Can only be used for node-level scheduling. If a private IP address is specified, the number of instances can only be one, and both the private IP address and the vSwitch ID are not empty, the private IP address takes effect.
        /// </summary>
        [Input("privateIpAddress")]
        public Input<string>? PrivateIpAddress { get; set; }

        /// <summary>
        /// Whether to assign a public IP identifier. Value:
        /// - true (default): Assign
        /// - false: do not assign.
        /// </summary>
        [Input("publicIpIdentification")]
        public Input<bool>? PublicIpIdentification { get; set; }

        /// <summary>
        /// Scheduling level, through which node-level scheduling or area scheduling is performed. Optional values:
        /// - Node-level scheduling: Region
        /// - Regional scheduling: Big (region),Middle (province),Small (city).
        /// </summary>
        [Input("scheduleAreaLevel")]
        public Input<string>? ScheduleAreaLevel { get; set; }

        /// <summary>
        /// Scheduling price policy. If it is not filled in, the default priority is low price. Value:
        /// - PriceLowPriority
        /// - PriceLowPriority (priority low price).
        /// </summary>
        [Input("schedulingPriceStrategy")]
        public Input<string>? SchedulingPriceStrategy { get; set; }

        /// <summary>
        /// Scheduling policy. Optional values:
        /// - Concentrate for node-level scheduling
        /// - For regional scheduling, Concentrate, Disperse.
        /// </summary>
        [Input("schedulingStrategy")]
        public Input<string>? SchedulingStrategy { get; set; }

        /// <summary>
        /// ID of the security group to which the instance belongs.
        /// </summary>
        [Input("securityId")]
        public Input<string>? SecurityId { get; set; }

        /// <summary>
        /// Status of the instance.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// System Disk Specification. SystemDisk is a non-required parameter when InstanceType is x86_pm,x86_bmi,x86_bm,pc_bmi, or arm_bmi. SystemDisk is a required parameter when instanceType is other specification families. See `system_disk` below.
        /// </summary>
        [Input("systemDisk")]
        public Input<Inputs.InstanceSystemDiskGetArgs>? SystemDisk { get; set; }

        /// <summary>
        /// Indicates whether to add an ordered suffix to HostName and InstanceName. The ordered suffix starts from 001 and cannot exceed 999.
        /// </summary>
        [Input("uniqueSuffix")]
        public Input<bool>? UniqueSuffix { get; set; }

        /// <summary>
        /// User-defined data, maximum support 16KB. You can pass in the UserData information. The UserData is encoded in Base64 format.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        /// <summary>
        /// The ID of the vSwitch to which the instance belongs. Can only be used in node-level scheduling.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public InstanceState()
        {
        }
        public static new InstanceState Empty => new InstanceState();
    }
}
