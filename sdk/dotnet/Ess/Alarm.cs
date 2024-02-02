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
    /// Provides a ESS alarm task resource.
    /// 
    /// For information about ess alarm, see [CreateAlarm](https://www.alibabacloud.com/help/en/auto-scaling/latest/createalarm).
    /// 
    /// &gt; **NOTE:** Available since v1.15.0.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// using Random = Pulumi.Random;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraform-example";
    ///     var defaultRandomInteger = new Random.RandomInteger("defaultRandomInteger", new()
    ///     {
    ///         Min = 10000,
    ///         Max = 99999,
    ///     });
    /// 
    ///     var myName = defaultRandomInteger.Result.Apply(result =&gt; $"{name}-{result}");
    /// 
    ///     var defaultZones = AliCloud.GetZones.Invoke(new()
    ///     {
    ///         AvailableDiskCategory = "cloud_efficiency",
    ///         AvailableResourceCreation = "VSwitch",
    ///     });
    /// 
    ///     var defaultInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
    ///     {
    ///         AvailabilityZone = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///         CpuCoreCount = 2,
    ///         MemorySize = 4,
    ///     });
    /// 
    ///     var defaultImages = AliCloud.Ecs.GetImages.Invoke(new()
    ///     {
    ///         NameRegex = "^ubuntu_18.*64",
    ///         MostRecent = true,
    ///         Owners = "system",
    ///     });
    /// 
    ///     var defaultNetwork = new AliCloud.Vpc.Network("defaultNetwork", new()
    ///     {
    ///         VpcName = myName,
    ///         CidrBlock = "172.16.0.0/16",
    ///     });
    /// 
    ///     var defaultSwitch = new AliCloud.Vpc.Switch("defaultSwitch", new()
    ///     {
    ///         VpcId = defaultNetwork.Id,
    ///         CidrBlock = "172.16.0.0/24",
    ///         ZoneId = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///         VswitchName = myName,
    ///     });
    /// 
    ///     var defaultSecurityGroup = new AliCloud.Ecs.SecurityGroup("defaultSecurityGroup", new()
    ///     {
    ///         VpcId = defaultNetwork.Id,
    ///     });
    /// 
    ///     var defaultSecurityGroupRule = new AliCloud.Ecs.SecurityGroupRule("defaultSecurityGroupRule", new()
    ///     {
    ///         Type = "ingress",
    ///         IpProtocol = "tcp",
    ///         NicType = "intranet",
    ///         Policy = "accept",
    ///         PortRange = "22/22",
    ///         Priority = 1,
    ///         SecurityGroupId = defaultSecurityGroup.Id,
    ///         CidrIp = "172.16.0.0/24",
    ///     });
    /// 
    ///     var default2 = new AliCloud.Vpc.Switch("default2", new()
    ///     {
    ///         VpcId = defaultNetwork.Id,
    ///         CidrBlock = "172.16.1.0/24",
    ///         ZoneId = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///         VswitchName = $"{name}-bar",
    ///     });
    /// 
    ///     var defaultScalingGroup = new AliCloud.Ess.ScalingGroup("defaultScalingGroup", new()
    ///     {
    ///         MinSize = 1,
    ///         MaxSize = 1,
    ///         ScalingGroupName = myName,
    ///         DefaultCooldown = 20,
    ///         VswitchIds = new[]
    ///         {
    ///             defaultSwitch.Id,
    ///             default2.Id,
    ///         },
    ///         RemovalPolicies = new[]
    ///         {
    ///             "OldestInstance",
    ///             "NewestInstance",
    ///         },
    ///     });
    /// 
    ///     var defaultScalingRule = new AliCloud.Ess.ScalingRule("defaultScalingRule", new()
    ///     {
    ///         ScalingRuleName = myName,
    ///         ScalingGroupId = defaultScalingGroup.Id,
    ///         AdjustmentType = "TotalCapacity",
    ///         AdjustmentValue = 2,
    ///         Cooldown = 60,
    ///     });
    /// 
    ///     var defaultAlarm = new AliCloud.Ess.Alarm("defaultAlarm", new()
    ///     {
    ///         Description = name,
    ///         AlarmActions = new[]
    ///         {
    ///             defaultScalingRule.Ari,
    ///         },
    ///         ScalingGroupId = defaultScalingGroup.Id,
    ///         MetricType = "system",
    ///         MetricName = "CpuUtilization",
    ///         Period = 300,
    ///         Statistics = "Average",
    ///         Threshold = "200.3",
    ///         ComparisonOperator = "&gt;=",
    ///         EvaluationCount = 2,
    ///     });
    /// 
    /// });
    /// ```
    /// ## Module Support
    /// 
    /// You can use to the existing autoscaling-rule module
    /// to create alarm task, different type rules and scheduled task one-click.
    /// 
    /// ## Import
    /// 
    /// Ess alarm can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ess/alarm:Alarm example asg-2ze500_045efffe-4d05
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ess/alarm:Alarm")]
    public partial class Alarm : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The list of actions to execute when this alarm transition into an ALARM state. Each action is specified as ess scaling rule ari.
        /// </summary>
        [Output("alarmActions")]
        public Output<ImmutableArray<string>> AlarmActions { get; private set; } = null!;

        /// <summary>
        /// Defines the application group id defined by CMS which is assigned when you upload custom metric to CMS, only available for custom metirc.
        /// </summary>
        [Output("cloudMonitorGroupId")]
        public Output<int?> CloudMonitorGroupId { get; private set; } = null!;

        /// <summary>
        /// The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Supported value: &gt;=, &lt;=, &gt;, &lt;. Defaults to &gt;=.
        /// </summary>
        [Output("comparisonOperator")]
        public Output<string?> ComparisonOperator { get; private set; } = null!;

        /// <summary>
        /// The description for the alarm.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The dimension map for the alarm's associated metric. For all metrics, you can not set the dimension key as "scaling_group" or "userId", which is set by default, the second dimension for metric, such as "device" for "PackagesNetIn", need to be set by users. See `dimensions` below.
        /// </summary>
        [Output("dimensions")]
        public Output<ImmutableDictionary<string, object>> Dimensions { get; private set; } = null!;

        /// <summary>
        /// Whether to enable specific ess alarm. Default to true.
        /// </summary>
        [Output("enable")]
        public Output<bool?> Enable { get; private set; } = null!;

        /// <summary>
        /// The number of times that needs to satisfies comparison condition before transition into ALARM state. Defaults to 3.
        /// </summary>
        [Output("evaluationCount")]
        public Output<int?> EvaluationCount { get; private set; } = null!;

        /// <summary>
        /// The name for the alarm's associated metric. See `dimensions` below for details.
        /// </summary>
        [Output("metricName")]
        public Output<string> MetricName { get; private set; } = null!;

        /// <summary>
        /// The type for the alarm's associated metric. Supported value: system, custom. "system" means the metric data is collected by Aliyun Cloud Monitor Service(CMS), "custom" means the metric data is upload to CMS by users. Defaults to system.
        /// </summary>
        [Output("metricType")]
        public Output<string?> MetricType { get; private set; } = null!;

        /// <summary>
        /// The name for ess alarm.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The period in seconds over which the specified statistic is applied. Supported value: 60, 120, 300, 900. Defaults to 300.
        /// </summary>
        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// The scaling group associated with this alarm, the 'ForceNew' attribute is available in 1.56.0+.
        /// </summary>
        [Output("scalingGroupId")]
        public Output<string> ScalingGroupId { get; private set; } = null!;

        /// <summary>
        /// The status of the event-triggered task. Valid values:
        /// - ALARM: The alert condition is met and an alert is triggered.
        /// - OK: The alert condition is not met.
        /// - INSUFFICIENT_DATA: Auto Scaling cannot determine whether the alert condition is met due to insufficient data.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// The statistic to apply to the alarm's associated metric. Supported value: Average, Minimum, Maximum. Defaults to Average.
        /// </summary>
        [Output("statistics")]
        public Output<string?> Statistics { get; private set; } = null!;

        /// <summary>
        /// The value against which the specified statistics is compared.
        /// </summary>
        [Output("threshold")]
        public Output<string> Threshold { get; private set; } = null!;


        /// <summary>
        /// Create a Alarm resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Alarm(string name, AlarmArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ess/alarm:Alarm", name, args ?? new AlarmArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Alarm(string name, Input<string> id, AlarmState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ess/alarm:Alarm", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Alarm resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Alarm Get(string name, Input<string> id, AlarmState? state = null, CustomResourceOptions? options = null)
        {
            return new Alarm(name, id, state, options);
        }
    }

    public sealed class AlarmArgs : global::Pulumi.ResourceArgs
    {
        [Input("alarmActions", required: true)]
        private InputList<string>? _alarmActions;

        /// <summary>
        /// The list of actions to execute when this alarm transition into an ALARM state. Each action is specified as ess scaling rule ari.
        /// </summary>
        public InputList<string> AlarmActions
        {
            get => _alarmActions ?? (_alarmActions = new InputList<string>());
            set => _alarmActions = value;
        }

        /// <summary>
        /// Defines the application group id defined by CMS which is assigned when you upload custom metric to CMS, only available for custom metirc.
        /// </summary>
        [Input("cloudMonitorGroupId")]
        public Input<int>? CloudMonitorGroupId { get; set; }

        /// <summary>
        /// The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Supported value: &gt;=, &lt;=, &gt;, &lt;. Defaults to &gt;=.
        /// </summary>
        [Input("comparisonOperator")]
        public Input<string>? ComparisonOperator { get; set; }

        /// <summary>
        /// The description for the alarm.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("dimensions")]
        private InputMap<object>? _dimensions;

        /// <summary>
        /// The dimension map for the alarm's associated metric. For all metrics, you can not set the dimension key as "scaling_group" or "userId", which is set by default, the second dimension for metric, such as "device" for "PackagesNetIn", need to be set by users. See `dimensions` below.
        /// </summary>
        public InputMap<object> Dimensions
        {
            get => _dimensions ?? (_dimensions = new InputMap<object>());
            set => _dimensions = value;
        }

        /// <summary>
        /// Whether to enable specific ess alarm. Default to true.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// The number of times that needs to satisfies comparison condition before transition into ALARM state. Defaults to 3.
        /// </summary>
        [Input("evaluationCount")]
        public Input<int>? EvaluationCount { get; set; }

        /// <summary>
        /// The name for the alarm's associated metric. See `dimensions` below for details.
        /// </summary>
        [Input("metricName", required: true)]
        public Input<string> MetricName { get; set; } = null!;

        /// <summary>
        /// The type for the alarm's associated metric. Supported value: system, custom. "system" means the metric data is collected by Aliyun Cloud Monitor Service(CMS), "custom" means the metric data is upload to CMS by users. Defaults to system.
        /// </summary>
        [Input("metricType")]
        public Input<string>? MetricType { get; set; }

        /// <summary>
        /// The name for ess alarm.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The period in seconds over which the specified statistic is applied. Supported value: 60, 120, 300, 900. Defaults to 300.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The scaling group associated with this alarm, the 'ForceNew' attribute is available in 1.56.0+.
        /// </summary>
        [Input("scalingGroupId", required: true)]
        public Input<string> ScalingGroupId { get; set; } = null!;

        /// <summary>
        /// The statistic to apply to the alarm's associated metric. Supported value: Average, Minimum, Maximum. Defaults to Average.
        /// </summary>
        [Input("statistics")]
        public Input<string>? Statistics { get; set; }

        /// <summary>
        /// The value against which the specified statistics is compared.
        /// </summary>
        [Input("threshold", required: true)]
        public Input<string> Threshold { get; set; } = null!;

        public AlarmArgs()
        {
        }
        public static new AlarmArgs Empty => new AlarmArgs();
    }

    public sealed class AlarmState : global::Pulumi.ResourceArgs
    {
        [Input("alarmActions")]
        private InputList<string>? _alarmActions;

        /// <summary>
        /// The list of actions to execute when this alarm transition into an ALARM state. Each action is specified as ess scaling rule ari.
        /// </summary>
        public InputList<string> AlarmActions
        {
            get => _alarmActions ?? (_alarmActions = new InputList<string>());
            set => _alarmActions = value;
        }

        /// <summary>
        /// Defines the application group id defined by CMS which is assigned when you upload custom metric to CMS, only available for custom metirc.
        /// </summary>
        [Input("cloudMonitorGroupId")]
        public Input<int>? CloudMonitorGroupId { get; set; }

        /// <summary>
        /// The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Supported value: &gt;=, &lt;=, &gt;, &lt;. Defaults to &gt;=.
        /// </summary>
        [Input("comparisonOperator")]
        public Input<string>? ComparisonOperator { get; set; }

        /// <summary>
        /// The description for the alarm.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("dimensions")]
        private InputMap<object>? _dimensions;

        /// <summary>
        /// The dimension map for the alarm's associated metric. For all metrics, you can not set the dimension key as "scaling_group" or "userId", which is set by default, the second dimension for metric, such as "device" for "PackagesNetIn", need to be set by users. See `dimensions` below.
        /// </summary>
        public InputMap<object> Dimensions
        {
            get => _dimensions ?? (_dimensions = new InputMap<object>());
            set => _dimensions = value;
        }

        /// <summary>
        /// Whether to enable specific ess alarm. Default to true.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// The number of times that needs to satisfies comparison condition before transition into ALARM state. Defaults to 3.
        /// </summary>
        [Input("evaluationCount")]
        public Input<int>? EvaluationCount { get; set; }

        /// <summary>
        /// The name for the alarm's associated metric. See `dimensions` below for details.
        /// </summary>
        [Input("metricName")]
        public Input<string>? MetricName { get; set; }

        /// <summary>
        /// The type for the alarm's associated metric. Supported value: system, custom. "system" means the metric data is collected by Aliyun Cloud Monitor Service(CMS), "custom" means the metric data is upload to CMS by users. Defaults to system.
        /// </summary>
        [Input("metricType")]
        public Input<string>? MetricType { get; set; }

        /// <summary>
        /// The name for ess alarm.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The period in seconds over which the specified statistic is applied. Supported value: 60, 120, 300, 900. Defaults to 300.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The scaling group associated with this alarm, the 'ForceNew' attribute is available in 1.56.0+.
        /// </summary>
        [Input("scalingGroupId")]
        public Input<string>? ScalingGroupId { get; set; }

        /// <summary>
        /// The status of the event-triggered task. Valid values:
        /// - ALARM: The alert condition is met and an alert is triggered.
        /// - OK: The alert condition is not met.
        /// - INSUFFICIENT_DATA: Auto Scaling cannot determine whether the alert condition is met due to insufficient data.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The statistic to apply to the alarm's associated metric. Supported value: Average, Minimum, Maximum. Defaults to Average.
        /// </summary>
        [Input("statistics")]
        public Input<string>? Statistics { get; set; }

        /// <summary>
        /// The value against which the specified statistics is compared.
        /// </summary>
        [Input("threshold")]
        public Input<string>? Threshold { get; set; }

        public AlarmState()
        {
        }
        public static new AlarmState Empty => new AlarmState();
    }
}
