// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Amqp
{
    /// <summary>
    /// Provides a Amqp Static Account resource.
    /// 
    /// For information about Amqp Static Account and how to use it, see [What is Static Account](https://help.aliyun.com/document_detail/184399.html).
    /// 
    /// &gt; **NOTE:** Available in v1.195.0+.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new AliCloud.Amqp.StaticAccount("default", new()
    ///     {
    ///         AccessKey = "LTAI5t8beMmVM1eRZtEJ6vfo",
    ///         InstanceId = "amqp-cn-0ju2y01zs001",
    ///         SecretKey = "sample-secret-key",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Amqp Static Account can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:amqp/staticAccount:StaticAccount example &lt;instance_id&gt;:&lt;access_key&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:amqp/staticAccount:StaticAccount")]
    public partial class StaticAccount : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Access key.
        /// </summary>
        [Output("accessKey")]
        public Output<string> AccessKey { get; private set; } = null!;

        /// <summary>
        /// Create time stamp. Unix timestamp, to millisecond level.
        /// </summary>
        [Output("createTime")]
        public Output<int> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Amqp instance ID.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// The ID of the user's primary account.
        /// </summary>
        [Output("masterUid")]
        public Output<string> MasterUid { get; private set; } = null!;

        /// <summary>
        /// Static password.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// Secret key.
        /// </summary>
        [Output("secretKey")]
        public Output<string> SecretKey { get; private set; } = null!;

        [Output("userName")]
        public Output<string> UserName { get; private set; } = null!;


        /// <summary>
        /// Create a StaticAccount resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StaticAccount(string name, StaticAccountArgs args, CustomResourceOptions? options = null)
            : base("alicloud:amqp/staticAccount:StaticAccount", name, args ?? new StaticAccountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StaticAccount(string name, Input<string> id, StaticAccountState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:amqp/staticAccount:StaticAccount", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "secretKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing StaticAccount resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StaticAccount Get(string name, Input<string> id, StaticAccountState? state = null, CustomResourceOptions? options = null)
        {
            return new StaticAccount(name, id, state, options);
        }
    }

    public sealed class StaticAccountArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access key.
        /// </summary>
        [Input("accessKey", required: true)]
        public Input<string> AccessKey { get; set; } = null!;

        /// <summary>
        /// Amqp instance ID.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        [Input("secretKey", required: true)]
        private Input<string>? _secretKey;

        /// <summary>
        /// Secret key.
        /// </summary>
        public Input<string>? SecretKey
        {
            get => _secretKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public StaticAccountArgs()
        {
        }
        public static new StaticAccountArgs Empty => new StaticAccountArgs();
    }

    public sealed class StaticAccountState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access key.
        /// </summary>
        [Input("accessKey")]
        public Input<string>? AccessKey { get; set; }

        /// <summary>
        /// Create time stamp. Unix timestamp, to millisecond level.
        /// </summary>
        [Input("createTime")]
        public Input<int>? CreateTime { get; set; }

        /// <summary>
        /// Amqp instance ID.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The ID of the user's primary account.
        /// </summary>
        [Input("masterUid")]
        public Input<string>? MasterUid { get; set; }

        /// <summary>
        /// Static password.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        [Input("secretKey")]
        private Input<string>? _secretKey;

        /// <summary>
        /// Secret key.
        /// </summary>
        public Input<string>? SecretKey
        {
            get => _secretKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public StaticAccountState()
        {
        }
        public static new StaticAccountState Empty => new StaticAccountState();
    }
}
