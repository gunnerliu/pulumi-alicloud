// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.AliKafka
{
    /// <summary>
    /// Provides an ALIKAFKA sasl acl resource.
    /// 
    /// &gt; **NOTE:** Available in 1.66.0+
    /// 
    /// &gt; **NOTE:**  Only the following regions support create alikafka sasl user.
    /// [`cn-hangzhou`,`cn-beijing`,`cn-shenzhen`,`cn-shanghai`,`cn-qingdao`,`cn-hongkong`,`cn-huhehaote`,`cn-zhangjiakou`,`cn-chengdu`,`cn-heyuan`,`ap-southeast-1`,`ap-southeast-3`,`ap-southeast-5`,`ap-south-1`,`ap-northeast-1`,`eu-central-1`,`eu-west-1`,`us-west-1`,`us-east-1`]
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
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
    ///         var username = config.Get("username") ?? "testusername";
    ///         var password = config.Get("password") ?? "testpassword";
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
    ///             VpcId = defaultNetwork.Id,
    ///             CidrBlock = "172.16.0.0/24",
    ///             ZoneId = defaultZones.Apply(defaultZones =&gt; defaultZones.Zones?[0]?.Id),
    ///         });
    ///         var defaultInstance = new AliCloud.AliKafka.Instance("defaultInstance", new AliCloud.AliKafka.InstanceArgs
    ///         {
    ///             TopicQuota = 50,
    ///             DiskType = 1,
    ///             DiskSize = 500,
    ///             DeployType = 5,
    ///             IoMax = 20,
    ///             VswitchId = defaultSwitch.Id,
    ///         });
    ///         var defaultTopic = new AliCloud.AliKafka.Topic("defaultTopic", new AliCloud.AliKafka.TopicArgs
    ///         {
    ///             InstanceId = defaultInstance.Id,
    ///             TopicName = "test-topic",
    ///             Remark = "topic-remark",
    ///         });
    ///         var defaultSaslUser = new AliCloud.AliKafka.SaslUser("defaultSaslUser", new AliCloud.AliKafka.SaslUserArgs
    ///         {
    ///             InstanceId = defaultInstance.Id,
    ///             Username = username,
    ///             Password = password,
    ///         });
    ///         var defaultSaslAcl = new AliCloud.AliKafka.SaslAcl("defaultSaslAcl", new AliCloud.AliKafka.SaslAclArgs
    ///         {
    ///             InstanceId = defaultInstance.Id,
    ///             Username = defaultSaslUser.Username,
    ///             AclResourceType = "Topic",
    ///             AclResourceName = defaultTopic.TopicName,
    ///             AclResourcePatternType = "LITERAL",
    ///             AclOperationType = "Write",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// ALIKAFKA GROUP can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:alikafka/saslAcl:SaslAcl acl alikafka_post-cn-123455abc:username:Topic:test-topic:LITERAL:Write
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:alikafka/saslAcl:SaslAcl")]
    public partial class SaslAcl : Pulumi.CustomResource
    {
        /// <summary>
        /// Operation type for this acl. The operation type can only be "Write" and "Read".
        /// </summary>
        [Output("aclOperationType")]
        public Output<string> AclOperationType { get; private set; } = null!;

        /// <summary>
        /// Resource name for this acl. The resource name should be a topic or consumer group name.
        /// </summary>
        [Output("aclResourceName")]
        public Output<string> AclResourceName { get; private set; } = null!;

        /// <summary>
        /// Resource pattern type for this acl. The resource pattern support two types "LITERAL" and "PREFIXED". "LITERAL": A literal name defines the full name of a resource. The special wildcard character "*" can be used to represent a resource with any name. "PREFIXED": A prefixed name defines a prefix for a resource.
        /// </summary>
        [Output("aclResourcePatternType")]
        public Output<string> AclResourcePatternType { get; private set; } = null!;

        /// <summary>
        /// Resource type for this acl. The resource type can only be "Topic" and "Group".
        /// </summary>
        [Output("aclResourceType")]
        public Output<string> AclResourceType { get; private set; } = null!;

        /// <summary>
        /// The host of the acl.
        /// </summary>
        [Output("host")]
        public Output<string> Host { get; private set; } = null!;

        /// <summary>
        /// ID of the ALIKAFKA Instance that owns the groups.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// Username for the sasl user. The length should between 1 to 64 characters. The user should be an existed sasl user.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a SaslAcl resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SaslAcl(string name, SaslAclArgs args, CustomResourceOptions? options = null)
            : base("alicloud:alikafka/saslAcl:SaslAcl", name, args ?? new SaslAclArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SaslAcl(string name, Input<string> id, SaslAclState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:alikafka/saslAcl:SaslAcl", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SaslAcl resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SaslAcl Get(string name, Input<string> id, SaslAclState? state = null, CustomResourceOptions? options = null)
        {
            return new SaslAcl(name, id, state, options);
        }
    }

    public sealed class SaslAclArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Operation type for this acl. The operation type can only be "Write" and "Read".
        /// </summary>
        [Input("aclOperationType", required: true)]
        public Input<string> AclOperationType { get; set; } = null!;

        /// <summary>
        /// Resource name for this acl. The resource name should be a topic or consumer group name.
        /// </summary>
        [Input("aclResourceName", required: true)]
        public Input<string> AclResourceName { get; set; } = null!;

        /// <summary>
        /// Resource pattern type for this acl. The resource pattern support two types "LITERAL" and "PREFIXED". "LITERAL": A literal name defines the full name of a resource. The special wildcard character "*" can be used to represent a resource with any name. "PREFIXED": A prefixed name defines a prefix for a resource.
        /// </summary>
        [Input("aclResourcePatternType", required: true)]
        public Input<string> AclResourcePatternType { get; set; } = null!;

        /// <summary>
        /// Resource type for this acl. The resource type can only be "Topic" and "Group".
        /// </summary>
        [Input("aclResourceType", required: true)]
        public Input<string> AclResourceType { get; set; } = null!;

        /// <summary>
        /// ID of the ALIKAFKA Instance that owns the groups.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// Username for the sasl user. The length should between 1 to 64 characters. The user should be an existed sasl user.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public SaslAclArgs()
        {
        }
    }

    public sealed class SaslAclState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Operation type for this acl. The operation type can only be "Write" and "Read".
        /// </summary>
        [Input("aclOperationType")]
        public Input<string>? AclOperationType { get; set; }

        /// <summary>
        /// Resource name for this acl. The resource name should be a topic or consumer group name.
        /// </summary>
        [Input("aclResourceName")]
        public Input<string>? AclResourceName { get; set; }

        /// <summary>
        /// Resource pattern type for this acl. The resource pattern support two types "LITERAL" and "PREFIXED". "LITERAL": A literal name defines the full name of a resource. The special wildcard character "*" can be used to represent a resource with any name. "PREFIXED": A prefixed name defines a prefix for a resource.
        /// </summary>
        [Input("aclResourcePatternType")]
        public Input<string>? AclResourcePatternType { get; set; }

        /// <summary>
        /// Resource type for this acl. The resource type can only be "Topic" and "Group".
        /// </summary>
        [Input("aclResourceType")]
        public Input<string>? AclResourceType { get; set; }

        /// <summary>
        /// The host of the acl.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// ID of the ALIKAFKA Instance that owns the groups.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// Username for the sasl user. The length should between 1 to 64 characters. The user should be an existed sasl user.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public SaslAclState()
        {
        }
    }
}
