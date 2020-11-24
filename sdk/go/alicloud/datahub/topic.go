// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package datahub

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// The topic is the basic unit of Datahub data source and is used to define one kind of data or stream. It contains a set of subscriptions. You can manage the datahub source of an application by using topics. [Refer to details](https://help.aliyun.com/document_detail/47440.html).
//
// ## Example Usage
//
// Basic Usage
//
// - BLob Topic
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/datahub"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := datahub.NewTopic(ctx, "example", &datahub.TopicArgs{
// 			Comment:     pulumi.String("created by terraform"),
// 			LifeCycle:   pulumi.Int(7),
// 			ProjectName: pulumi.String("tf_datahub_project"),
// 			RecordType:  pulumi.String("BLOB"),
// 			ShardCount:  pulumi.Int(3),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// - Tuple Topic
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/datahub"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := datahub.NewTopic(ctx, "example", &datahub.TopicArgs{
// 			Comment:     pulumi.String("created by terraform"),
// 			LifeCycle:   pulumi.Int(7),
// 			ProjectName: pulumi.String("tf_datahub_project"),
// 			RecordSchema: pulumi.StringMap{
// 				"bigint_field":    pulumi.String("BIGINT"),
// 				"boolean_field":   pulumi.String("BOOLEAN"),
// 				"double_field":    pulumi.String("DOUBLE"),
// 				"string_field":    pulumi.String("STRING"),
// 				"timestamp_field": pulumi.String("TIMESTAMP"),
// 			},
// 			RecordType: pulumi.String("TUPLE"),
// 			ShardCount: pulumi.Int(3),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Datahub topic can be imported using the ID, e.g.
//
// ```sh
//  $ pulumi import alicloud:datahub/topic:Topic example tf_datahub_project:tf_datahub_topic
// ```
type Topic struct {
	pulumi.CustomResourceState

	// Comment of the datahub topic. It cannot be longer than 255 characters.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Create time of the datahub topic. It is a human-readable string rather than 64-bits UTC.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Last modify time of the datahub topic. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
	LastModifyTime pulumi.StringOutput `pulumi:"lastModifyTime"`
	// How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
	LifeCycle pulumi.IntPtrOutput `pulumi:"lifeCycle"`
	// The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the datahub project that this topic belongs to. It is case-insensitive.
	ProjectName pulumi.StringOutput `pulumi:"projectName"`
	// Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
	// - BIGINT
	// - STRING
	// - BOOLEAN
	// - DOUBLE
	// - TIMESTAMP
	RecordSchema pulumi.MapOutput `pulumi:"recordSchema"`
	// The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
	RecordType pulumi.StringPtrOutput `pulumi:"recordType"`
	// The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
	ShardCount pulumi.IntPtrOutput `pulumi:"shardCount"`
}

// NewTopic registers a new resource with the given unique name, arguments, and options.
func NewTopic(ctx *pulumi.Context,
	name string, args *TopicArgs, opts ...pulumi.ResourceOption) (*Topic, error) {
	if args == nil || args.ProjectName == nil {
		return nil, errors.New("missing required argument 'ProjectName'")
	}
	if args == nil {
		args = &TopicArgs{}
	}
	var resource Topic
	err := ctx.RegisterResource("alicloud:datahub/topic:Topic", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTopic gets an existing Topic resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTopic(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TopicState, opts ...pulumi.ResourceOption) (*Topic, error) {
	var resource Topic
	err := ctx.ReadResource("alicloud:datahub/topic:Topic", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Topic resources.
type topicState struct {
	// Comment of the datahub topic. It cannot be longer than 255 characters.
	Comment *string `pulumi:"comment"`
	// Create time of the datahub topic. It is a human-readable string rather than 64-bits UTC.
	CreateTime *string `pulumi:"createTime"`
	// Last modify time of the datahub topic. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
	LastModifyTime *string `pulumi:"lastModifyTime"`
	// How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
	LifeCycle *int `pulumi:"lifeCycle"`
	// The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	Name *string `pulumi:"name"`
	// The name of the datahub project that this topic belongs to. It is case-insensitive.
	ProjectName *string `pulumi:"projectName"`
	// Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
	// - BIGINT
	// - STRING
	// - BOOLEAN
	// - DOUBLE
	// - TIMESTAMP
	RecordSchema map[string]interface{} `pulumi:"recordSchema"`
	// The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
	RecordType *string `pulumi:"recordType"`
	// The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
	ShardCount *int `pulumi:"shardCount"`
}

type TopicState struct {
	// Comment of the datahub topic. It cannot be longer than 255 characters.
	Comment pulumi.StringPtrInput
	// Create time of the datahub topic. It is a human-readable string rather than 64-bits UTC.
	CreateTime pulumi.StringPtrInput
	// Last modify time of the datahub topic. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
	LastModifyTime pulumi.StringPtrInput
	// How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
	LifeCycle pulumi.IntPtrInput
	// The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	Name pulumi.StringPtrInput
	// The name of the datahub project that this topic belongs to. It is case-insensitive.
	ProjectName pulumi.StringPtrInput
	// Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
	// - BIGINT
	// - STRING
	// - BOOLEAN
	// - DOUBLE
	// - TIMESTAMP
	RecordSchema pulumi.MapInput
	// The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
	RecordType pulumi.StringPtrInput
	// The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
	ShardCount pulumi.IntPtrInput
}

func (TopicState) ElementType() reflect.Type {
	return reflect.TypeOf((*topicState)(nil)).Elem()
}

type topicArgs struct {
	// Comment of the datahub topic. It cannot be longer than 255 characters.
	Comment *string `pulumi:"comment"`
	// How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
	LifeCycle *int `pulumi:"lifeCycle"`
	// The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	Name *string `pulumi:"name"`
	// The name of the datahub project that this topic belongs to. It is case-insensitive.
	ProjectName string `pulumi:"projectName"`
	// Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
	// - BIGINT
	// - STRING
	// - BOOLEAN
	// - DOUBLE
	// - TIMESTAMP
	RecordSchema map[string]interface{} `pulumi:"recordSchema"`
	// The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
	RecordType *string `pulumi:"recordType"`
	// The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
	ShardCount *int `pulumi:"shardCount"`
}

// The set of arguments for constructing a Topic resource.
type TopicArgs struct {
	// Comment of the datahub topic. It cannot be longer than 255 characters.
	Comment pulumi.StringPtrInput
	// How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
	LifeCycle pulumi.IntPtrInput
	// The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	Name pulumi.StringPtrInput
	// The name of the datahub project that this topic belongs to. It is case-insensitive.
	ProjectName pulumi.StringInput
	// Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
	// - BIGINT
	// - STRING
	// - BOOLEAN
	// - DOUBLE
	// - TIMESTAMP
	RecordSchema pulumi.MapInput
	// The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
	RecordType pulumi.StringPtrInput
	// The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
	ShardCount pulumi.IntPtrInput
}

func (TopicArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*topicArgs)(nil)).Elem()
}

type TopicInput interface {
	pulumi.Input

	ToTopicOutput() TopicOutput
	ToTopicOutputWithContext(ctx context.Context) TopicOutput
}

func (Topic) ElementType() reflect.Type {
	return reflect.TypeOf((*Topic)(nil)).Elem()
}

func (i Topic) ToTopicOutput() TopicOutput {
	return i.ToTopicOutputWithContext(context.Background())
}

func (i Topic) ToTopicOutputWithContext(ctx context.Context) TopicOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicOutput)
}

type TopicOutput struct {
	*pulumi.OutputState
}

func (TopicOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*TopicOutput)(nil)).Elem()
}

func (o TopicOutput) ToTopicOutput() TopicOutput {
	return o
}

func (o TopicOutput) ToTopicOutputWithContext(ctx context.Context) TopicOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(TopicOutput{})
}
