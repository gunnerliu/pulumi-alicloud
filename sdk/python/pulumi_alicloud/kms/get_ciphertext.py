# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetCiphertextResult',
    'AwaitableGetCiphertextResult',
    'get_ciphertext',
]

@pulumi.output_type
class GetCiphertextResult:
    """
    A collection of values returned by getCiphertext.
    """
    def __init__(__self__, ciphertext_blob=None, encryption_context=None, id=None, key_id=None, plaintext=None):
        if ciphertext_blob and not isinstance(ciphertext_blob, str):
            raise TypeError("Expected argument 'ciphertext_blob' to be a str")
        pulumi.set(__self__, "ciphertext_blob", ciphertext_blob)
        if encryption_context and not isinstance(encryption_context, dict):
            raise TypeError("Expected argument 'encryption_context' to be a dict")
        pulumi.set(__self__, "encryption_context", encryption_context)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if key_id and not isinstance(key_id, str):
            raise TypeError("Expected argument 'key_id' to be a str")
        pulumi.set(__self__, "key_id", key_id)
        if plaintext and not isinstance(plaintext, str):
            raise TypeError("Expected argument 'plaintext' to be a str")
        pulumi.set(__self__, "plaintext", plaintext)

    @property
    @pulumi.getter(name="ciphertextBlob")
    def ciphertext_blob(self) -> str:
        """
        The ciphertext of the data key encrypted with the primary CMK version.
        """
        return pulumi.get(self, "ciphertext_blob")

    @property
    @pulumi.getter(name="encryptionContext")
    def encryption_context(self) -> Optional[Mapping[str, str]]:
        return pulumi.get(self, "encryption_context")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="keyId")
    def key_id(self) -> str:
        return pulumi.get(self, "key_id")

    @property
    @pulumi.getter
    def plaintext(self) -> str:
        return pulumi.get(self, "plaintext")


class AwaitableGetCiphertextResult(GetCiphertextResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCiphertextResult(
            ciphertext_blob=self.ciphertext_blob,
            encryption_context=self.encryption_context,
            id=self.id,
            key_id=self.key_id,
            plaintext=self.plaintext)


def get_ciphertext(encryption_context: Optional[Mapping[str, str]] = None,
                   key_id: Optional[str] = None,
                   plaintext: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCiphertextResult:
    """
    Use this data source to access information about an existing resource.

    :param Mapping[str, str] encryption_context: -
           (Optional) The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
    :param str key_id: The globally unique ID of the CMK.
    :param str plaintext: The plaintext to be encrypted which must be encoded in Base64.
    """
    __args__ = dict()
    __args__['encryptionContext'] = encryption_context
    __args__['keyId'] = key_id
    __args__['plaintext'] = plaintext
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:kms/getCiphertext:getCiphertext', __args__, opts=opts, typ=GetCiphertextResult).value

    return AwaitableGetCiphertextResult(
        ciphertext_blob=__ret__.ciphertext_blob,
        encryption_context=__ret__.encryption_context,
        id=__ret__.id,
        key_id=__ret__.key_id,
        plaintext=__ret__.plaintext)
