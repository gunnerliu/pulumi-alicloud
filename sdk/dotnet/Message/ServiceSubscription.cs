// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Message
{
    /// <summary>
    /// Provides a Message Notification Service Subscription resource.
    /// 
    /// For information about Message Notification Service Subscription and how to use it, see [What is Subscription](https://www.alibabacloud.com/help/en/message-service/latest/subscribe-1).
    /// 
    /// &gt; **NOTE:** Available since v1.188.0.
    /// 
    /// ## Import
    /// 
    /// Message Notification Service Subscription can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:message/serviceSubscription:ServiceSubscription example &lt;topic_name&gt;:&lt;subscription_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:message/serviceSubscription:ServiceSubscription")]
    public partial class ServiceSubscription : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The endpoint has three format. Available values format:
        /// - `HTTP Format`: http://xxx.com/xxx
        /// - `Queue Format`: acs:mns:{REGION}:{AccountID}:queues/{QueueName}
        /// - `Email Format`: mail:directmail:{MailAddress}
        /// </summary>
        [Output("endpoint")]
        public Output<string> Endpoint { get; private set; } = null!;

        /// <summary>
        /// The tag that is used to filter messages. Only the messages that have the same tag can be pushed. A tag is a string that can be up to 16 characters in length. By default, no tag is specified to filter messages.
        /// </summary>
        [Output("filterTag")]
        public Output<string?> FilterTag { get; private set; } = null!;

        /// <summary>
        /// The NotifyContentFormat attribute of Subscription. This attribute specifies the content format of the messages pushed to users. Valid values: `XML`, `JSON` and `SIMPLIFIED`. Default value: `XML`.
        /// </summary>
        [Output("notifyContentFormat")]
        public Output<string> NotifyContentFormat { get; private set; } = null!;

        /// <summary>
        /// The NotifyStrategy attribute of Subscription. This attribute specifies the retry strategy when message sending fails. Default value: `BACKOFF_RETRY`. Valid values:
        /// </summary>
        [Output("notifyStrategy")]
        public Output<string> NotifyStrategy { get; private set; } = null!;

        /// <summary>
        /// The Push type of Subscription. The Valid values: `http`, `queue`, `mpush`, `alisms` and `email`.
        /// </summary>
        [Output("pushType")]
        public Output<string> PushType { get; private set; } = null!;

        /// <summary>
        /// Two topics subscription on a single account in the same topic cannot have the same name. A topic subscription name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
        /// </summary>
        [Output("subscriptionName")]
        public Output<string> SubscriptionName { get; private set; } = null!;

        /// <summary>
        /// The topic which The subscription belongs to was named with the name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
        /// </summary>
        [Output("topicName")]
        public Output<string> TopicName { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceSubscription resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceSubscription(string name, ServiceSubscriptionArgs args, CustomResourceOptions? options = null)
            : base("alicloud:message/serviceSubscription:ServiceSubscription", name, args ?? new ServiceSubscriptionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceSubscription(string name, Input<string> id, ServiceSubscriptionState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:message/serviceSubscription:ServiceSubscription", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServiceSubscription resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceSubscription Get(string name, Input<string> id, ServiceSubscriptionState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceSubscription(name, id, state, options);
        }
    }

    public sealed class ServiceSubscriptionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The endpoint has three format. Available values format:
        /// - `HTTP Format`: http://xxx.com/xxx
        /// - `Queue Format`: acs:mns:{REGION}:{AccountID}:queues/{QueueName}
        /// - `Email Format`: mail:directmail:{MailAddress}
        /// </summary>
        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        /// <summary>
        /// The tag that is used to filter messages. Only the messages that have the same tag can be pushed. A tag is a string that can be up to 16 characters in length. By default, no tag is specified to filter messages.
        /// </summary>
        [Input("filterTag")]
        public Input<string>? FilterTag { get; set; }

        /// <summary>
        /// The NotifyContentFormat attribute of Subscription. This attribute specifies the content format of the messages pushed to users. Valid values: `XML`, `JSON` and `SIMPLIFIED`. Default value: `XML`.
        /// </summary>
        [Input("notifyContentFormat")]
        public Input<string>? NotifyContentFormat { get; set; }

        /// <summary>
        /// The NotifyStrategy attribute of Subscription. This attribute specifies the retry strategy when message sending fails. Default value: `BACKOFF_RETRY`. Valid values:
        /// </summary>
        [Input("notifyStrategy")]
        public Input<string>? NotifyStrategy { get; set; }

        /// <summary>
        /// The Push type of Subscription. The Valid values: `http`, `queue`, `mpush`, `alisms` and `email`.
        /// </summary>
        [Input("pushType", required: true)]
        public Input<string> PushType { get; set; } = null!;

        /// <summary>
        /// Two topics subscription on a single account in the same topic cannot have the same name. A topic subscription name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
        /// </summary>
        [Input("subscriptionName", required: true)]
        public Input<string> SubscriptionName { get; set; } = null!;

        /// <summary>
        /// The topic which The subscription belongs to was named with the name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
        /// </summary>
        [Input("topicName", required: true)]
        public Input<string> TopicName { get; set; } = null!;

        public ServiceSubscriptionArgs()
        {
        }
        public static new ServiceSubscriptionArgs Empty => new ServiceSubscriptionArgs();
    }

    public sealed class ServiceSubscriptionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The endpoint has three format. Available values format:
        /// - `HTTP Format`: http://xxx.com/xxx
        /// - `Queue Format`: acs:mns:{REGION}:{AccountID}:queues/{QueueName}
        /// - `Email Format`: mail:directmail:{MailAddress}
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// The tag that is used to filter messages. Only the messages that have the same tag can be pushed. A tag is a string that can be up to 16 characters in length. By default, no tag is specified to filter messages.
        /// </summary>
        [Input("filterTag")]
        public Input<string>? FilterTag { get; set; }

        /// <summary>
        /// The NotifyContentFormat attribute of Subscription. This attribute specifies the content format of the messages pushed to users. Valid values: `XML`, `JSON` and `SIMPLIFIED`. Default value: `XML`.
        /// </summary>
        [Input("notifyContentFormat")]
        public Input<string>? NotifyContentFormat { get; set; }

        /// <summary>
        /// The NotifyStrategy attribute of Subscription. This attribute specifies the retry strategy when message sending fails. Default value: `BACKOFF_RETRY`. Valid values:
        /// </summary>
        [Input("notifyStrategy")]
        public Input<string>? NotifyStrategy { get; set; }

        /// <summary>
        /// The Push type of Subscription. The Valid values: `http`, `queue`, `mpush`, `alisms` and `email`.
        /// </summary>
        [Input("pushType")]
        public Input<string>? PushType { get; set; }

        /// <summary>
        /// Two topics subscription on a single account in the same topic cannot have the same name. A topic subscription name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
        /// </summary>
        [Input("subscriptionName")]
        public Input<string>? SubscriptionName { get; set; }

        /// <summary>
        /// The topic which The subscription belongs to was named with the name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
        /// </summary>
        [Input("topicName")]
        public Input<string>? TopicName { get; set; }

        public ServiceSubscriptionState()
        {
        }
        public static new ServiceSubscriptionState Empty => new ServiceSubscriptionState();
    }
}
