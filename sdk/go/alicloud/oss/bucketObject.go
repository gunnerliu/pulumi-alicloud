// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package oss

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to put a object(content or file) to a oss bucket.
//
// ## Example Usage
// ### Uploading a file to a bucket
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/oss"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := oss.NewBucketObject(ctx, "object-source", &oss.BucketObjectArgs{
//				Bucket: pulumi.String("your_bucket_name"),
//				Key:    pulumi.String("new_object_key"),
//				Source: pulumi.String("path/to/file"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Uploading a content to a bucket
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/oss"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := oss.NewBucket(ctx, "example", &oss.BucketArgs{
//				Bucket: pulumi.String("your_bucket_name"),
//				Acl:    pulumi.String("public-read"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = oss.NewBucketObject(ctx, "object-content", &oss.BucketObjectArgs{
//				Bucket:  example.Bucket,
//				Key:     pulumi.String("new_object_key"),
//				Content: pulumi.String("the content that you want to upload."),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type BucketObject struct {
	pulumi.CustomResourceState

	// The [canned ACL](https://www.alibabacloud.com/help/doc-detail/52284.htm) to apply. Defaults to "private".
	Acl pulumi.StringPtrOutput `pulumi:"acl"`
	// The name of the bucket to put the file in.
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// Specifies caching behavior along the request/reply chain. Read [RFC2616 Cache-Control](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	CacheControl pulumi.StringPtrOutput `pulumi:"cacheControl"`
	// The literal content being uploaded to the bucket.
	Content pulumi.StringPtrOutput `pulumi:"content"`
	// Specifies presentational information for the object. Read [RFC2616 Content-Disposition](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	ContentDisposition pulumi.StringPtrOutput `pulumi:"contentDisposition"`
	// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [RFC2616 Content-Encoding](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	ContentEncoding pulumi.StringPtrOutput `pulumi:"contentEncoding"`
	// the content length of request.
	ContentLength pulumi.StringOutput `pulumi:"contentLength"`
	// The MD5 value of the content. Read [MD5](https://www.alibabacloud.com/help/doc-detail/31978.htm) for computing method.
	ContentMd5 pulumi.StringPtrOutput `pulumi:"contentMd5"`
	// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
	ContentType pulumi.StringOutput `pulumi:"contentType"`
	// the ETag generated for the object (an MD5 sum of the object content).
	Etag pulumi.StringOutput `pulumi:"etag"`
	// Specifies expire date for the the request/response. Read [RFC2616 Expires](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	Expires pulumi.StringPtrOutput `pulumi:"expires"`
	// The name of the object once it is in the bucket.
	Key pulumi.StringOutput `pulumi:"key"`
	// Specifies the primary key managed by KMS. This parameter is valid when the value of `serverSideEncryption` is set to KMS.
	//
	// Either `source` or `content` must be provided to specify the bucket content.
	// These two arguments are mutually-exclusive.
	KmsKeyId pulumi.StringPtrOutput `pulumi:"kmsKeyId"`
	// Specifies server-side encryption of the object in OSS. Valid values are `AES256`, `KMS`. Default value is `AES256`.
	ServerSideEncryption pulumi.StringPtrOutput `pulumi:"serverSideEncryption"`
	// The path to the source file being uploaded to the bucket.
	Source pulumi.StringPtrOutput `pulumi:"source"`
	// A unique version ID value for the object, if bucket versioning is enabled.
	VersionId pulumi.StringOutput `pulumi:"versionId"`
}

// NewBucketObject registers a new resource with the given unique name, arguments, and options.
func NewBucketObject(ctx *pulumi.Context,
	name string, args *BucketObjectArgs, opts ...pulumi.ResourceOption) (*BucketObject, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	var resource BucketObject
	err := ctx.RegisterResource("alicloud:oss/bucketObject:BucketObject", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBucketObject gets an existing BucketObject resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBucketObject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BucketObjectState, opts ...pulumi.ResourceOption) (*BucketObject, error) {
	var resource BucketObject
	err := ctx.ReadResource("alicloud:oss/bucketObject:BucketObject", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BucketObject resources.
type bucketObjectState struct {
	// The [canned ACL](https://www.alibabacloud.com/help/doc-detail/52284.htm) to apply. Defaults to "private".
	Acl *string `pulumi:"acl"`
	// The name of the bucket to put the file in.
	Bucket *string `pulumi:"bucket"`
	// Specifies caching behavior along the request/reply chain. Read [RFC2616 Cache-Control](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	CacheControl *string `pulumi:"cacheControl"`
	// The literal content being uploaded to the bucket.
	Content *string `pulumi:"content"`
	// Specifies presentational information for the object. Read [RFC2616 Content-Disposition](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	ContentDisposition *string `pulumi:"contentDisposition"`
	// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [RFC2616 Content-Encoding](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	ContentEncoding *string `pulumi:"contentEncoding"`
	// the content length of request.
	ContentLength *string `pulumi:"contentLength"`
	// The MD5 value of the content. Read [MD5](https://www.alibabacloud.com/help/doc-detail/31978.htm) for computing method.
	ContentMd5 *string `pulumi:"contentMd5"`
	// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
	ContentType *string `pulumi:"contentType"`
	// the ETag generated for the object (an MD5 sum of the object content).
	Etag *string `pulumi:"etag"`
	// Specifies expire date for the the request/response. Read [RFC2616 Expires](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	Expires *string `pulumi:"expires"`
	// The name of the object once it is in the bucket.
	Key *string `pulumi:"key"`
	// Specifies the primary key managed by KMS. This parameter is valid when the value of `serverSideEncryption` is set to KMS.
	//
	// Either `source` or `content` must be provided to specify the bucket content.
	// These two arguments are mutually-exclusive.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// Specifies server-side encryption of the object in OSS. Valid values are `AES256`, `KMS`. Default value is `AES256`.
	ServerSideEncryption *string `pulumi:"serverSideEncryption"`
	// The path to the source file being uploaded to the bucket.
	Source *string `pulumi:"source"`
	// A unique version ID value for the object, if bucket versioning is enabled.
	VersionId *string `pulumi:"versionId"`
}

type BucketObjectState struct {
	// The [canned ACL](https://www.alibabacloud.com/help/doc-detail/52284.htm) to apply. Defaults to "private".
	Acl pulumi.StringPtrInput
	// The name of the bucket to put the file in.
	Bucket pulumi.StringPtrInput
	// Specifies caching behavior along the request/reply chain. Read [RFC2616 Cache-Control](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	CacheControl pulumi.StringPtrInput
	// The literal content being uploaded to the bucket.
	Content pulumi.StringPtrInput
	// Specifies presentational information for the object. Read [RFC2616 Content-Disposition](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	ContentDisposition pulumi.StringPtrInput
	// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [RFC2616 Content-Encoding](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	ContentEncoding pulumi.StringPtrInput
	// the content length of request.
	ContentLength pulumi.StringPtrInput
	// The MD5 value of the content. Read [MD5](https://www.alibabacloud.com/help/doc-detail/31978.htm) for computing method.
	ContentMd5 pulumi.StringPtrInput
	// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
	ContentType pulumi.StringPtrInput
	// the ETag generated for the object (an MD5 sum of the object content).
	Etag pulumi.StringPtrInput
	// Specifies expire date for the the request/response. Read [RFC2616 Expires](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	Expires pulumi.StringPtrInput
	// The name of the object once it is in the bucket.
	Key pulumi.StringPtrInput
	// Specifies the primary key managed by KMS. This parameter is valid when the value of `serverSideEncryption` is set to KMS.
	//
	// Either `source` or `content` must be provided to specify the bucket content.
	// These two arguments are mutually-exclusive.
	KmsKeyId pulumi.StringPtrInput
	// Specifies server-side encryption of the object in OSS. Valid values are `AES256`, `KMS`. Default value is `AES256`.
	ServerSideEncryption pulumi.StringPtrInput
	// The path to the source file being uploaded to the bucket.
	Source pulumi.StringPtrInput
	// A unique version ID value for the object, if bucket versioning is enabled.
	VersionId pulumi.StringPtrInput
}

func (BucketObjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketObjectState)(nil)).Elem()
}

type bucketObjectArgs struct {
	// The [canned ACL](https://www.alibabacloud.com/help/doc-detail/52284.htm) to apply. Defaults to "private".
	Acl *string `pulumi:"acl"`
	// The name of the bucket to put the file in.
	Bucket string `pulumi:"bucket"`
	// Specifies caching behavior along the request/reply chain. Read [RFC2616 Cache-Control](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	CacheControl *string `pulumi:"cacheControl"`
	// The literal content being uploaded to the bucket.
	Content *string `pulumi:"content"`
	// Specifies presentational information for the object. Read [RFC2616 Content-Disposition](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	ContentDisposition *string `pulumi:"contentDisposition"`
	// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [RFC2616 Content-Encoding](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	ContentEncoding *string `pulumi:"contentEncoding"`
	// The MD5 value of the content. Read [MD5](https://www.alibabacloud.com/help/doc-detail/31978.htm) for computing method.
	ContentMd5 *string `pulumi:"contentMd5"`
	// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
	ContentType *string `pulumi:"contentType"`
	// Specifies expire date for the the request/response. Read [RFC2616 Expires](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	Expires *string `pulumi:"expires"`
	// The name of the object once it is in the bucket.
	Key string `pulumi:"key"`
	// Specifies the primary key managed by KMS. This parameter is valid when the value of `serverSideEncryption` is set to KMS.
	//
	// Either `source` or `content` must be provided to specify the bucket content.
	// These two arguments are mutually-exclusive.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// Specifies server-side encryption of the object in OSS. Valid values are `AES256`, `KMS`. Default value is `AES256`.
	ServerSideEncryption *string `pulumi:"serverSideEncryption"`
	// The path to the source file being uploaded to the bucket.
	Source *string `pulumi:"source"`
}

// The set of arguments for constructing a BucketObject resource.
type BucketObjectArgs struct {
	// The [canned ACL](https://www.alibabacloud.com/help/doc-detail/52284.htm) to apply. Defaults to "private".
	Acl pulumi.StringPtrInput
	// The name of the bucket to put the file in.
	Bucket pulumi.StringInput
	// Specifies caching behavior along the request/reply chain. Read [RFC2616 Cache-Control](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	CacheControl pulumi.StringPtrInput
	// The literal content being uploaded to the bucket.
	Content pulumi.StringPtrInput
	// Specifies presentational information for the object. Read [RFC2616 Content-Disposition](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	ContentDisposition pulumi.StringPtrInput
	// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [RFC2616 Content-Encoding](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	ContentEncoding pulumi.StringPtrInput
	// The MD5 value of the content. Read [MD5](https://www.alibabacloud.com/help/doc-detail/31978.htm) for computing method.
	ContentMd5 pulumi.StringPtrInput
	// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
	ContentType pulumi.StringPtrInput
	// Specifies expire date for the the request/response. Read [RFC2616 Expires](https://www.ietf.org/rfc/rfc2616.txt) for further details.
	Expires pulumi.StringPtrInput
	// The name of the object once it is in the bucket.
	Key pulumi.StringInput
	// Specifies the primary key managed by KMS. This parameter is valid when the value of `serverSideEncryption` is set to KMS.
	//
	// Either `source` or `content` must be provided to specify the bucket content.
	// These two arguments are mutually-exclusive.
	KmsKeyId pulumi.StringPtrInput
	// Specifies server-side encryption of the object in OSS. Valid values are `AES256`, `KMS`. Default value is `AES256`.
	ServerSideEncryption pulumi.StringPtrInput
	// The path to the source file being uploaded to the bucket.
	Source pulumi.StringPtrInput
}

func (BucketObjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketObjectArgs)(nil)).Elem()
}

type BucketObjectInput interface {
	pulumi.Input

	ToBucketObjectOutput() BucketObjectOutput
	ToBucketObjectOutputWithContext(ctx context.Context) BucketObjectOutput
}

func (*BucketObject) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketObject)(nil)).Elem()
}

func (i *BucketObject) ToBucketObjectOutput() BucketObjectOutput {
	return i.ToBucketObjectOutputWithContext(context.Background())
}

func (i *BucketObject) ToBucketObjectOutputWithContext(ctx context.Context) BucketObjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketObjectOutput)
}

// BucketObjectArrayInput is an input type that accepts BucketObjectArray and BucketObjectArrayOutput values.
// You can construct a concrete instance of `BucketObjectArrayInput` via:
//
//	BucketObjectArray{ BucketObjectArgs{...} }
type BucketObjectArrayInput interface {
	pulumi.Input

	ToBucketObjectArrayOutput() BucketObjectArrayOutput
	ToBucketObjectArrayOutputWithContext(context.Context) BucketObjectArrayOutput
}

type BucketObjectArray []BucketObjectInput

func (BucketObjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketObject)(nil)).Elem()
}

func (i BucketObjectArray) ToBucketObjectArrayOutput() BucketObjectArrayOutput {
	return i.ToBucketObjectArrayOutputWithContext(context.Background())
}

func (i BucketObjectArray) ToBucketObjectArrayOutputWithContext(ctx context.Context) BucketObjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketObjectArrayOutput)
}

// BucketObjectMapInput is an input type that accepts BucketObjectMap and BucketObjectMapOutput values.
// You can construct a concrete instance of `BucketObjectMapInput` via:
//
//	BucketObjectMap{ "key": BucketObjectArgs{...} }
type BucketObjectMapInput interface {
	pulumi.Input

	ToBucketObjectMapOutput() BucketObjectMapOutput
	ToBucketObjectMapOutputWithContext(context.Context) BucketObjectMapOutput
}

type BucketObjectMap map[string]BucketObjectInput

func (BucketObjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketObject)(nil)).Elem()
}

func (i BucketObjectMap) ToBucketObjectMapOutput() BucketObjectMapOutput {
	return i.ToBucketObjectMapOutputWithContext(context.Background())
}

func (i BucketObjectMap) ToBucketObjectMapOutputWithContext(ctx context.Context) BucketObjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketObjectMapOutput)
}

type BucketObjectOutput struct{ *pulumi.OutputState }

func (BucketObjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketObject)(nil)).Elem()
}

func (o BucketObjectOutput) ToBucketObjectOutput() BucketObjectOutput {
	return o
}

func (o BucketObjectOutput) ToBucketObjectOutputWithContext(ctx context.Context) BucketObjectOutput {
	return o
}

// The [canned ACL](https://www.alibabacloud.com/help/doc-detail/52284.htm) to apply. Defaults to "private".
func (o BucketObjectOutput) Acl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BucketObject) pulumi.StringPtrOutput { return v.Acl }).(pulumi.StringPtrOutput)
}

// The name of the bucket to put the file in.
func (o BucketObjectOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketObject) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// Specifies caching behavior along the request/reply chain. Read [RFC2616 Cache-Control](https://www.ietf.org/rfc/rfc2616.txt) for further details.
func (o BucketObjectOutput) CacheControl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BucketObject) pulumi.StringPtrOutput { return v.CacheControl }).(pulumi.StringPtrOutput)
}

// The literal content being uploaded to the bucket.
func (o BucketObjectOutput) Content() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BucketObject) pulumi.StringPtrOutput { return v.Content }).(pulumi.StringPtrOutput)
}

// Specifies presentational information for the object. Read [RFC2616 Content-Disposition](https://www.ietf.org/rfc/rfc2616.txt) for further details.
func (o BucketObjectOutput) ContentDisposition() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BucketObject) pulumi.StringPtrOutput { return v.ContentDisposition }).(pulumi.StringPtrOutput)
}

// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [RFC2616 Content-Encoding](https://www.ietf.org/rfc/rfc2616.txt) for further details.
func (o BucketObjectOutput) ContentEncoding() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BucketObject) pulumi.StringPtrOutput { return v.ContentEncoding }).(pulumi.StringPtrOutput)
}

// the content length of request.
func (o BucketObjectOutput) ContentLength() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketObject) pulumi.StringOutput { return v.ContentLength }).(pulumi.StringOutput)
}

// The MD5 value of the content. Read [MD5](https://www.alibabacloud.com/help/doc-detail/31978.htm) for computing method.
func (o BucketObjectOutput) ContentMd5() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BucketObject) pulumi.StringPtrOutput { return v.ContentMd5 }).(pulumi.StringPtrOutput)
}

// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
func (o BucketObjectOutput) ContentType() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketObject) pulumi.StringOutput { return v.ContentType }).(pulumi.StringOutput)
}

// the ETag generated for the object (an MD5 sum of the object content).
func (o BucketObjectOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketObject) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// Specifies expire date for the the request/response. Read [RFC2616 Expires](https://www.ietf.org/rfc/rfc2616.txt) for further details.
func (o BucketObjectOutput) Expires() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BucketObject) pulumi.StringPtrOutput { return v.Expires }).(pulumi.StringPtrOutput)
}

// The name of the object once it is in the bucket.
func (o BucketObjectOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketObject) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// Specifies the primary key managed by KMS. This parameter is valid when the value of `serverSideEncryption` is set to KMS.
//
// Either `source` or `content` must be provided to specify the bucket content.
// These two arguments are mutually-exclusive.
func (o BucketObjectOutput) KmsKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BucketObject) pulumi.StringPtrOutput { return v.KmsKeyId }).(pulumi.StringPtrOutput)
}

// Specifies server-side encryption of the object in OSS. Valid values are `AES256`, `KMS`. Default value is `AES256`.
func (o BucketObjectOutput) ServerSideEncryption() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BucketObject) pulumi.StringPtrOutput { return v.ServerSideEncryption }).(pulumi.StringPtrOutput)
}

// The path to the source file being uploaded to the bucket.
func (o BucketObjectOutput) Source() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BucketObject) pulumi.StringPtrOutput { return v.Source }).(pulumi.StringPtrOutput)
}

// A unique version ID value for the object, if bucket versioning is enabled.
func (o BucketObjectOutput) VersionId() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketObject) pulumi.StringOutput { return v.VersionId }).(pulumi.StringOutput)
}

type BucketObjectArrayOutput struct{ *pulumi.OutputState }

func (BucketObjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketObject)(nil)).Elem()
}

func (o BucketObjectArrayOutput) ToBucketObjectArrayOutput() BucketObjectArrayOutput {
	return o
}

func (o BucketObjectArrayOutput) ToBucketObjectArrayOutputWithContext(ctx context.Context) BucketObjectArrayOutput {
	return o
}

func (o BucketObjectArrayOutput) Index(i pulumi.IntInput) BucketObjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BucketObject {
		return vs[0].([]*BucketObject)[vs[1].(int)]
	}).(BucketObjectOutput)
}

type BucketObjectMapOutput struct{ *pulumi.OutputState }

func (BucketObjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketObject)(nil)).Elem()
}

func (o BucketObjectMapOutput) ToBucketObjectMapOutput() BucketObjectMapOutput {
	return o
}

func (o BucketObjectMapOutput) ToBucketObjectMapOutputWithContext(ctx context.Context) BucketObjectMapOutput {
	return o
}

func (o BucketObjectMapOutput) MapIndex(k pulumi.StringInput) BucketObjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BucketObject {
		return vs[0].(map[string]*BucketObject)[vs[1].(string)]
	}).(BucketObjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BucketObjectInput)(nil)).Elem(), &BucketObject{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketObjectArrayInput)(nil)).Elem(), BucketObjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketObjectMapInput)(nil)).Elem(), BucketObjectMap{})
	pulumi.RegisterOutputType(BucketObjectOutput{})
	pulumi.RegisterOutputType(BucketObjectArrayOutput{})
	pulumi.RegisterOutputType(BucketObjectMapOutput{})
}
